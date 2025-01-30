<%-- 
    Document   : login
    Created on : Jan 31, 2025, 2:42:03 AM
    Author     : chanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login  Page</title>
        <script src="https://kit.fontawesome.com/fc0bcca8a3.js" crossorigin="anonymous"></script>
        <script src="https://cdn.tailwindcss.com"></script>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">
         
    </head>
     <body class="flex justify-center items-center min-h-screen bg-gray-100 font-sans">
        <div class="container bg-white rounded-lg shadow-2xl overflow-hidden w-[900px] max-w-full min-h-[480px] relative">
            <div class="grid grid-cols-2 h-full">
                <!-- Left side - Image and Sign Up Button -->
                <div class="bg-yellow-50 flex flex-col items-center justify-center p-8 relative">
                    <img src="resources/images/login_signup_image/login.png" alt="Sign In Image" class="rounded-lg mb-4 max-w-xs h-auto"/>
                    <div class="text-center">
                        <h2 class="text-xl font-semibold mb-4">Don't have an account?</h2>
                        <p class="text-gray-600 mb-6">Sign up to get started with us</p>
                        <a href="signup.jsp" class="rounded-full border-2 border-yellow-500 text-yellow-500 text-xs font-bold py-3 px-11 uppercase tracking-wide transition hover:bg-yellow-500 hover:text-white">Sign Up</a>
                    </div>
                </div>

                <!-- Right side - Sign In Form -->
                <div class="p-8">
                    <form method="POST" action="login_back.jsp" class="flex flex-col h-full justify-center items-center text-center">
                        <h1 class="font-bold text-2xl mb-4">Sign In</h1>  
                         <%                                                      //change
                            if(request.getParameter("s")!=null){
                                if(request.getParameter("s").equals("0")){
                        %>
                        <h6 style='color:red'>Incorrect username or password</h6>
                        <%
                                }
                            }
                        %>
                        <br>
                        <input type="email" placeholder="Email" name="email" class="bg-gray-100 border-none py-3 px-4 mb-3 w-full rounded-3xl focus:outline-none focus:ring-2 focus:ring-yellow-500" />
                        <div class="relative w-full">
                            <input type="password" placeholder="Password" name="password" class="bg-gray-100 border-none py-3 px-4 mb-4 w-full rounded-3xl focus:outline-none focus:ring-2 focus:ring-yellow-500" id="signinPassword"/>
                            <i  id="signinTogglePassword"></i>
                        </div>
                        
                        <a href="#" class="text-gray-700 text-sm no-underline mb-5">Forgot your password?</a>
                        
                        <button type="submit" class="rounded-full border border-yellow-500 bg-yellow-500 text-white text-base font-bold py-3 px-11 uppercase tracking-wide transition hover:bg-yellow-600 mb-5">Sign In</button>
                       
                    </form>
                </div>
            </div>
        </div>

        <script>
            const signinTogglePassword = document.getElementById('signinTogglePassword');
            const signinPassword = document.getElementById('signinPassword');

            signinTogglePassword.addEventListener('click', function() {
                const type = signinPassword.getAttribute('type') === 'password' ? 'text' : 'password';
                signinPassword.setAttribute('type', type);
                this.classList.toggle('fa-eye');
                this.classList.toggle('fa-eye-slash');
            });
        </script>
    </body>
</html>
