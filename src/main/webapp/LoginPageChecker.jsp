<%
    String username = request.getParameter("userId");
    String password = request.getParameter("password");
    if (username == "" || password == "") {
        out.println("Invalid parameters<br/>");
            }

    if (username.toLowerCase().trim().equals("admin") && password.trim().equals("admin")) {
        out.println("Authentication successful<br/>");
    }
    else {
        out.println("Authentication failed<br/>");
    }
%>