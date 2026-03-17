<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portal Smart City</title>
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

        .header { text-align: center; margin-bottom: 2rem; }

        .icon-circle {
            display: inline-block;
            padding: 0.75rem;
            background-color: #2563eb;
            border-radius: 50%;
            margin-bottom: 1rem;
            font-size: 2rem;
            line-height: 1;
        }

        .header h1 {
            font-size: 1.875rem;
            font-weight: 700;
            color: #111827;
            margin-bottom: 0.5rem;
        }

        .header p { color: #4b5563; }

        .card {
            background: white;
            border-radius: 0.5rem;
            box-shadow: 0 10px 15px rgba(0,0,0,0.1);
            padding: 2rem;
        }

        .login-banner {
            display: flex;
            align-items: center;
            gap: 0.5rem;
            background-color: #3b82f6;
            color: white;
            padding: 0.75rem 1rem;
            border-radius: 0.5rem;
            margin-bottom: 1.5rem;
        }

        .login-banner h2 { font-size: 1.25rem; font-weight: 600; }

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
            transition: border-color 0.2s;
        }

        .form-group input:focus { border-color: #3b82f6; box-shadow: 0 0 0 2px rgba(59,130,246,0.3); }

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
            margin-top: 0.5rem;
        }

        .btn-primary:hover { background-color: #2563eb; }

        .link-recuperar {
            display: flex;
            align-items: center;
            justify-content: center;
            gap: 0.5rem;
            width: 100%;
            padding: 0.5rem;
            margin-top: 1.5rem;
            background: none;
            border: none;
            color: #2563eb;
            font-size: 0.875rem;
            font-weight: 500;
            cursor: pointer;
            text-decoration: none;
        }

        .link-recuperar:hover { color: #1d4ed8; }

        .divider { border-top: 1px solid #e5e7eb; margin-top: 1rem; padding-top: 1rem; }

        .btn-signup {
            display: flex;
            align-items: center;
            justify-content: center;
            gap: 0.5rem;
            width: 100%;
            padding: 0.5rem 1rem;
            margin-bottom: 0.5rem;
            background-color: #f9fafb;
            border: 1px solid #e5e7eb;
            border-radius: 0.5rem;
            color: #374151;
            font-size: 0.9rem;
            font-weight: 500;
            cursor: pointer;
            text-decoration: none;
            transition: background-color 0.2s;
        }

        .btn-signup:hover { background-color: #f3f4f6; }

        .icon-municipio { color: #0d9488; }
        .icon-cidadao   { color: #ea580c; }

        .error-msg {
            background: #fee2e2;
            color: #dc2626;
            padding: 0.5rem 1rem;
            border-radius: 0.5rem;
            font-size: 0.875rem;
            margin-bottom: 1rem;
        }
    </style>
</head>
<body>

<div class="container">

    <!-- Header -->
    <div class="header">
        <div class="icon-circle">🏙️</div>
        <h1>Portal Smart City</h1>
        <p>Sistema de Controle de Emissões CO₂</p>
    </div>

    <!-- Card -->
    <div class="card">

        <!-- Banner LOGIN -->
        <div class="login-banner">
            <span>👤</span>
            <h2>LOGIN</h2>
        </div>

        <!-- Mensagem de erro (Spring injeta se houver) -->
        <% if (request.getAttribute("erro") != null) { %>
        <div class="error-msg">${erro}</div>
        <% } %>

        <!-- Formulário -->
        <form action="${pageContext.request.contextPath}/login" method="post">
            <div class="form-group">
                <label for="email">Utilizador / Email</label>
                <input type="email" id="email" name="email"
                       placeholder="Email" required />
            </div>
            <div class="form-group">
                <label for="password">Palavra-passe</label>
                <input type="password" id="password" name="password"
                       placeholder="Password" required />
            </div>
            <button type="submit" class="btn-primary">Entrar</button>
        </form>

        <!-- Recuperar password -->
        <a href="${pageContext.request.contextPath}/recuperar-password"
           class="link-recuperar">
            🔑 Recuperar Password
        </a>

        <!-- Sign Up -->
        <div class="divider">
            <a href="${pageContext.request.contextPath}/municipio/login"
               class="btn-signup">
                <span class="icon-municipio">🏛️</span> Sign Up Município
            </a>
            <a href="${pageContext.request.contextPath}/cidadao/login"
               class="btn-signup">
                <span class="icon-cidadao">👤</span> Sign Up Cidadão
            </a>
        </div>

    </div>
</div>

</body>
</html>