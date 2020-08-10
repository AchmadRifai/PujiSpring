<#include "header1.ftl">
<body class="hold-transition login-page">
	<div class="login-box">
		<div class="login-logo">
			<a href="/"><b>AYAM</b>BAKAR</a>
		</div>
		<div class="card">
			<div class="card-body login-card-body">
				<p class="login-box-msg">Tolong Login Dahulu</p>
				<form action="/login.exe" method="post">
					<div class="input-group mb-3">
						<input type="text" class="form-control" placeholder="Username" name="uid">
						<div class="input-group-append">
							<div class="input-group-text">
								<span class="fas fa-user"></span>
							</div>
						</div>
					</div>
					<div class="input-group mb-3">
						<input type="password" class="form-control" placeholder="Password" name="sandi">
						<div class="input-group-append">
							<div class="input-group-text">
								<span class="fas fa-lock"></span>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<button type="submit" class="btn btn-primary btn-block">LogIn</button>
						</div>
					</div>
				</form>
				<#if error>
				<div class="alert alert-danger">
					<h5>Login Error</h5>
				</div>
				</#if>
			</div>
		</div>
	</div>
<#include "foot1.ftl">