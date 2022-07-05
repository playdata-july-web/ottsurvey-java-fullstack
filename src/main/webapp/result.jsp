<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 화면</title>
</head>
<body>

	<div>
		<table border="1" id="table">
			<thead>
				<tr>
					<th>설문조사 번호</th>
					<th>OTT 서비스</th>
					<th>이용 이유</th>
					<th>이용 장르</th>
					<th>이용 시간</th>
				</tr>
			</thead>
		</table>
	</div>

	<script>
		const datas = `${requestScope.datas}`;

		let string = datas.replace("[OTTFormDTO(", "");
		string = string.replace(")]", "");
		string = string.replaceAll("OTTFormDTO(", "");
		string = string.replaceAll("ottId=", "");
		string = string.replaceAll("ottName=", "");
		string = string.replaceAll("ottGenre=", "");
		string = string.replaceAll("ottReason=", "");
		string = string.replaceAll("ottTime=", "");

		let array = string.split("),");
		
		for(i in array) {
			array[i] = array[i].split(",");
		}
		
		let table = "";
		for(i in array) {
			let body = "<tr>";
			for(j in array[i]) {
				body += "<td>";
				body += array[i][j];
				body += "</td>";
			}
			body += "</tr>";
			table += body;
		}
		console.log(table);
		
		document.getElementById("table").innerHTML += table;
		
	</script>
</body>
</html>