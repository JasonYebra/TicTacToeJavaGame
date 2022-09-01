<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
	<h1>Tic Tac Toe</h1>
	
	<script>
		let board=
		[
			[
				0,0,0
			],
			[
				0,0,0
			],
			[
				0,0,0
			]
		];
		
		onload=()=>
		{
			move(true,2,1); // 1=x, 0=o
		}
		
		move=(shape,xdir,ydir)=>
		{
			let data=
			{
				shape:shape,
				xdir:xdir,
				ydir:ydir
			};
			
			
			fetch("http://localhost:8080/move",{
				method:"POST",
				mode:"cors",
				headers:{'Content-Type':'application/json'},
				body: JSON.stringify(data)
			})
			.then(res=>res.json())
			.then(res=>console.log(res));
		}
	</script>
</body>
</html>