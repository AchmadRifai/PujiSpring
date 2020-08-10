<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<#if autoreload><meta http-equiv="refresh" content="5"></#if>
		<title>${judul}</title>
		<link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
		<link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
		<link rel="stylesheet" href="dist/css/adminlte.min.css">
		<link rel="stylesheet" 
			href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
		<#if addCss>
		<#list csse as css>
		<link rel="stylesheet" href="${css}">
		</#list>
		</#if>
	</head>