<script src="plugins/jquery/jquery.min.js"></script>
<script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="dist/js/adminlte.js"></script>
<#if addJs>
	<#list jsse as js>
		<script src="${js}"></script>
	</#list>
</#if>
</body>
</html>