<#include "header1.ftl">
<body class="hold-transition sidebar-mini">
<div class="wrapper">
	<nav class="main-header navbar navbar-expand navbar-white navbar-light">
		<ul class="navbar-nav">
			<li class="nav-item">
				<a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
			</li>
		</ul>
		<ul class="navbar-nav ml-auto">
			<li class="nav-item dropdown">
				<a class="nav-link" data-toggle="dropdown" href="#">
					<i class="far fa-user"></i>
					<span class="badge badge-danger navbar-badge"></span>
				</a>
				<div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
					<a href="/edit.php" class="dropdown-item">
						<i class="fas fa-users"></i> Edit Your Profile
					</a>
					<a href="/logout.php" class="dropdown-item">
						Logout
					</a>
				</div>
			</li>
		</ul>
	</nav>
	<aside class="main-sidebar sidebar-dark-primary elevation-4">
		<a href="/index.html" class="brand-link">
			<img src="dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" 
				style="opacity: .8">
      		<span class="brand-text font-weight-light">AdminLTE 3</span>
		</a>
		<div class="sidebar">
			<nav class="mt-2">
				<ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
				<#list menus as menu>
					<li class="nav-item"><a href="${menu.ke}" class="nav-link">
						<i class="nav-icon fas fa-${menu.ikon}"></i>
						<p>${menu.isi}</p>
					</a></li>
				</#list>
				</ul>
			</nav>
		</div>
	</aside>
	<div class="content-wrapper">
		<div class="content-header">
			<div class="container-fluid">
				<div class="row mb-2">
					<div class="col-sm-6">
						<h1 class="m-0 text-dark">${judul}</h1>
					</div>
					<div class="col-sm-6">
						<ol class="breadcrumb float-sm-right">
							<li class="breadcrumb-item"><a href="/index.html">Home</a></li>
							<li class="breadcrumb-item active">${ini.jab}</li>
						</ol>
					</div>
				</div>
			</div>
		</div>
		<div class="content">
			<div class="container-fluid">
				<div class="row">
					<div class="col-12">
					<#list pesans as pesan>
						<div class="card">
							<div class="card-header">
								<h3 class="card-title">Pesanan Dari Meja ${pesan.meja}</h3>
								<div class="card-tools">
									<button type="button" class="btn btn-tool" data-card-widget="collapse" 
									data-toggle="tooltip" title="Collapse"><i class="fas fa-minus"></i></button>
								</div>
							</div>
							<div class="card-body">
								<table class="table table-bordered table-hover tabele">
									<thead>
										<tr>
											<td>Nama Pesanan</td>
											<td>Jumlah Pesanan</td>
										</tr>
									</thead>
									<tbody>
									<#list pesan.items as item>
										<tr>
											<td>${item.menu.nama}</td>
											<td>${item.qty}</td>
										</tr>
									</#list>
									</tbody>
								</table>
							</div>
						</div>
					</#list>
					</div>
				</div>
			</div>
		</div>
	</div>
<#include "kaki.ftl">
</div>
<#include "foot1.ftl">