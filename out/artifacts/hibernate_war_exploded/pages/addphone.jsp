<%--
  Created by IntelliJ IDEA.
  User: NDV_Luce
  Date: 8/10/2019
  Time: 7:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="/include/header.jsp"/>
<body>
    <form class="form-horizontal" name="myForm" method="post" action="">
        <div class="form-group">
            <label>Name</label>
            <div class="col-sm-10">
                <input name="name" type="text">
            </div>
        </div>
        <div class="form-group">
            <label>Brand</label>
            <div class="col-sm-10">
                <select name="brand">
                    <option>Apple</option>
                    <option>Samsung</option>
                    <option>Nokia</option>
                    <option>Other</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label>Price</label>
            <div class="col-sm-10" name="price">
                <input name="price" type="number">
            </div>
        </div>
        <div class="form-group">
            <label>Description</label>
            <div class="col-sm-10">
                <input name="description" type="text">
            </div>
        </div>
        <div class="box-footer">
            <div class="form-group col-sm-2">
                <input type="submit" value="Submit" class="btn-btn-info">
            </div>
            <div>
                <input type="reset" value="Reset">
            </div>
        </div>
    </form>
    <jsp:include page="/include/footer.jsp"/>
</body>
</html>
