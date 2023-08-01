<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>OTP Test</title>
</head>
<body>
<h1>OTP Test</h1>
<p>Scan the QR code below with the Google Authenticator app:</p>
<img src="<%= request.getAttribute("url") %>" alt="QR Code" width="200" height="200">

<p>After scanning, enter the OTP code generated by the app to complete registration.</p>

<h2>OTP Key</h2>
<p>Save this key: <%= request.getAttribute("encodedKey") %></p>
</body>
</html>
