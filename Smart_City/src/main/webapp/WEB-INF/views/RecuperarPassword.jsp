<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Recuperar Password – Portal Smart City</title>
    <style>
        * { box-sizing: border-box; margin: 0; padding: 0; }

        body {
            min-height: 100vh;
            background: linear-gradient(135deg, #eff6ff 0%, #dbeafe 100%);
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 1rem;
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', sans-serif;
        }

        .container { width: 100%; max-width: 448px; }

        .btn-voltar {
            display: flex;
            align-items: center;
            gap: 0.5rem;
            background: none;
            border: none;
            color: #2563eb;
            font-size: 0.95rem;
            cursor: pointer;
            margin-bottom: 1.5rem;
            text-decoration: none;
        }
        .btn-voltar:hover { color: #1d4ed8; }

        .card {
            background: white;
            border-radius: 0.5rem;
            box-shadow: 0 10px 15px rgba(0,0,0,0.1);
            padding: 2rem;
        }

        /* --- Estado 1: formulário --- */
        .header-form { text-align: center; margin-bottom: 1.5rem; }

        .icon-circle-blue {
            display: inline-block;
            padding: 1rem;
            background-color: #dbeafe;
            border-radius: 50%;
            font-size: 2.5rem;
            line-height: 1;
            margin-bottom: 1rem;
        }

        .header-form h2 {
            font-size: 1.5rem;
            font-weight: 700;
            color: #111827;
            margin-bottom: 0.5rem;
        }

        .header-form p { font-size: 0.875rem; color: #4b5563; }

        .form-group { margin-bottom: 1rem; }

        .form-group label {
            display: block;
            font-size: 0.875rem;
            font-weight: 500;
            color: #374151;
            margin-bottom: 0.25rem;
        }

        .form-group input {
            width: 100%;
            padding: 0.5rem 1rem;
            border: 1px solid #d1d5db;
            border-radius: 0.5rem;
            font-size: 1rem;
            outline: none;
        }
        .form-group input:focus {
            border-color: #3b82f6;
            box-shadow: 0 0 0 2px rgba(59,130,246,0.3);
        }

        .btn-primary {
            width: 100%;
            padding: 0.625rem;
            background-color: #3b82f6;
            color: white;
            border: none;
            border-radius: 0.5rem;
            font-size: 1rem;
            font-weight: 500;
            cursor: pointer;
            transition: background-color 0.2s;
        }
        .btn-primary:hover { background-color: #2563eb; }

        /* --- Estado 2: confirmação --- */
        .confirmacao {
            text-align: center;
            padding: 2rem 0;
        }

        .icon-circle-green {
            display: inline-block;
            padding: 1rem;
            background-color: #dcfce7;
            border-radius: 50%;
            font-size: 3rem;
            line-height: 1;
            margin-bottom: 1rem;
        }

        .confirmacao h2 {
            font-size: 1.5rem;
            font-weight: 700;
            color: #111827;
            margin-bottom: 0.5rem;
        }

        .confirmacao p {
            color: #4b5563;
            margin-bottom: 1.5rem;
            font-size: 0.95rem;
        }

        .btn-confirmar {
            padding: 0.625rem 1.5rem;
            background-color: #3b82f6;
            color: white;
            border: none;
            border-radius: 0.5rem;
            font-size: 1rem;
            font-weight: 500;
            cursor: pointer;
            text-decoration: none;
            transition: background-color 0.2s;
        }
        .btn-confirmar:hover { background-color: #2563eb; }
    </style>
</head>
<body>

<div class="container">

    <!-- Voltar ao login -->
    <a href="${pageContext.request.contextPath}/" class="btn-voltar">
        ← Voltar ao Login
    </a>

    <div class="card">

        <%-- Lógica de estado: Spring põe "emailEnviado=true" no request após POST --%>
        <% boolean emailEnviado = Boolean.TRUE.equals(request.getAttribute("emailEnviado")); %>

        <% if (!emailEnviado) { %>

        <%-- ESTADO 1: Formulário --%>
        <div class="header-form">
            <div class="icon-circle-blue">📧</div>
            <h2>Recuperação de Password</h2>
            <p>O seu email será utilizado para envio das instruções
                de recuperação da sua password via email.</p>
        </div>

        <% if (request.getAttribute("erro") != null) { %>
        <div style="background:#fee2e2;color:#dc2626;padding:0.5rem 1rem;
                            border-radius:0.5rem;font-size:0.875rem;margin-bottom:1rem;">
            ${erro}
        </div>
        <% } %>

        <form action="${pageContext.request.contextPath}/recuperar-password"
              method="post">
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email"
                       placeholder="seu@email.com" required />
            </div>
            <button type="submit" class="btn-primary">Verificar Email</button>
        </form>

        <% } else { %>

        <%-- ESTADO 2: Confirmação --%>
        <div class="confirmacao">
            <div class="icon-circle-green">✅</div>
            <h2>E-Mail Enviado</h2>
            <p>Por favor verifique a sua caixa de entrada.<br>
                As instruções de recuperação foram enviadas para o seu email.</p>
            <a href="${pageContext.request.contextPath}/"
               class="btn-confirmar">
                Voltar ao Login
            </a>
        </div>

        <% } %>

    </div>
</div>

</body>
</html>
```

---

## Decisão de design importante

O `emailEnviado` em React era estado local no browser. Em JSP o fluxo é:
```
GET  /recuperar-password          → mostra formulário  (emailEnviado = false)
POST /recuperar-password + email  → Controller processa → seta emailEnviado=true no request
→ forward de volta para o mesmo JSP → mostra confirmação