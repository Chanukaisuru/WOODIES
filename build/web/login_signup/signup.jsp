<%-- 
    Document   : signup
    Created on : Jan 31, 2025, 2:34:25 AM
    Author     : chanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>signup Page</title>
        <script src="https://kit.fontawesome.com/fc0bcca8a3.js" crossorigin="anonymous"></script>
        <script src="https://cdn.tailwindcss.com"></script>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">
         
    </head>
    <body class="flex justify-center items-center min-h-screen bg-gray-100 font-sans">
        <div class="container bg-white rounded-lg shadow-2xl overflow-hidden w-[900px] max-w-full min-h-[480px] relative">
            <!-- Left side - Sign Up Form -->
            <div class="grid grid-cols-2 h-full">
                <div class="p-8">
                    <form method="POST" action="registration.jsp" class="flex flex-col h-full justify-center items-center text-center">
                        <h1 class="font-bold text-2xl mb-4">Create Account</h1>
                        <%                                                      //change
                            if(request.getParameter("s")!=null){
                                String message;
                                if(request.getParameter("s").equals("1")){
                                    message="<h6 style='color:green'>You have successfuly registered</h6>";
                                }else{
                                    message="<h6 style='color:red'>Error occured.Please try again</h6>";
                                }
                                out.println(message);
                            }
                        %>
                        <br>
                        <input type="text" placeholder="First Name" name="firstname" class="bg-gray-100 border-none py-3 px-4 mb-3 w-full rounded-3xl focus:outline-none focus:ring-2 focus:ring-yellow-500"/>
                        <input type="text" placeholder="Last Name" name="lastname" class="bg-gray-100 border-none py-3 px-4 mb-3 w-full rounded-3xl focus:outline-none focus:ring-2 focus:ring-yellow-500"/>
                         <input type="email" placeholder="Email" name="email" class="bg-gray-100 border-none py-3 px-4 mb-3 w-full rounded-3xl focus:outline-none focus:ring-2 focus:ring-yellow-500"/>
                        <div class="relative w-full">
                            <input type="password" placeholder="Password" name="password" class="bg-gray-100 border-none py-3 px-4 mb-6 w-full rounded-3xl focus:outline-none focus:ring-2 focus:ring-yellow-500" id="signupPassword"/>
                            <i  id="signupTogglePassword"></i>
                        </div>
                         <button type="submit" class="rounded-full border border-yellow-500 bg-yellow-500 text-white text-base font-bold py-3 px-11 uppercase tracking-wide transition hover:bg-yellow-600 mb-5 inline-block text-center" >
                            Sign Up
                         </button>
                                               
                        
                    </form>
                </div>
                
                 <!-- Right side - Image and Sign In Button -->
                <div class="bg-yellow-50 flex flex-col items-center justify-center p-8 relative">
                    <img src="../resources/images/login_signup_image/signup.png" alt="Sign Up Image" class="rounded-lg mb-4 max-w-xs h-auto"/>
                    <div class="text-center">
                        <h2 class="text-xl font-semibold mb-2">Already have an account?</h2>
                        <p class="text-gray-600 mb-6">Sign in to access your account</p>
                        <a href="login.jsp" class="rounded-full border-2 border-yellow-500 text-yellow-500 text-xs font-bold py-3 px-11 uppercase tracking-wide transition hover:bg-yellow-500 hover:text-white">Sign In</a>
                    </div>
                </div>
            </div>
        </div>
        
        <script>
            const signupTogglePassword = document.getElementById('signupTogglePassword');
            const signupPassword = document.getElementById('signupPassword');

            signupTogglePassword.addEventListener('click', function() {
                const type = signupPassword.getAttribute('type') === 'password' ? 'text' : 'password';
                signupPassword.setAttribute('type', type);
                this.classList.toggle('fa-eye');
                this.classList.toggle('fa-eye-slash');
            });
        </script>
            
    </body>
</html>
