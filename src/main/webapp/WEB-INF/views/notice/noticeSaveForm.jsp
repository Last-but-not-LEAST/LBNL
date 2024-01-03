<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>save</title>
    <!-- Bootstrap 5 CSS -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Optional custom styles */
        body {
            padding-top: 20px;
        }
        .center-buttons {
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>공지사항 등록하기</h2>
    <form:form modelAttribute="noticeDTO" action="${pageContext.request.contextPath}/notice/save" method="post">
        <table class="table">
            <tr>
                <th>제목</th>
                <td>
                    <form:input path="noticeTitle" type="text" class="form-control" placeholder="제목을 입력하세요" required="true"/>
                </td>
            </tr>
            <tr>
                <th>내용</th>
                <td>
                    <form:textarea path="noticeContent" cols="30" rows="10" class="form-control" placeholder="내용을 입력하세요" required="true"></form:textarea>
                </td>
            </tr>
        </table>
        <div class="center-buttons">
            <button type="submit" class="btn btn-primary">등록</button>
            <button type="button" onclick="cancelFn()" class="btn btn-secondary">뒤로가기</button>
        </div>
    </form:form>
</div>
<!-- Bootstrap 5 JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
<script>
    const cancelFn = () => {
        location.href = "/notice/";
    }
</script>
</body>
</html>