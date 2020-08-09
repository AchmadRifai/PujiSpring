<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
		<title>${judul} - AyamSolo</title>
	</head>
	<body>
		<h1>Daftar Karyawan</h1>
		<table>
			<thead>
				<tr>
					<td>Kode</td>
					<td>Nama</td>
					<td>Password</td>
					<td>Alamat</td>
					<td>Jabatan</td>
					<td>Sedang Login</td>
				</tr>
			</thead>
			<tbody>
			<#list karyawans as karyawan>
				<tr>
					<td>${karyawan.kode}</td>
					<td>${karyawan.nama}</td>
					<td>${karyawan.pass}</td>
					<td>${karyawan.almt}</td>
					<td>${karyawan.jab}</td>
					<td><#if karyawan.mlebu>Mergawe<#else>Muleh</#if></td>
				</tr>
			</#list>
			</tbody>
		</table>
		<h1>Daftar Kategori Menu</h1>
		<table>
			<thead>
				<tr>
					<td>Kode</td>
					<td>Nama</td>
					<td>Gambar</td>
				</tr>
			</thead>
			<tbody>
			<#list kats as kat>
				<tr>
					<td>${kat.kode}</td>
					<td>${kat.nama}</td>
					<td><img alt="${kat.nama}" src="${kat.gbr}"></td>
				</tr>
			</#list>
			</tbody>
		</table>
	</body>
</html>