<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/tab.css">
        <script src="js/tab.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ออกใบกำกับภาษีอิเล็กทรอนิกส์</title>
    </head>
    <body>
        <div class="tab">
            <button class="tablinks" onclick="openCompany(event, 'buyer')" id="defaultOpen">ผู้ซื้อ</button>
            <button class="tablinks" onclick="openCompany(event, 'seller')">ผู้ขาย</button>
        </div>
        <form action="#" method="post">
            <div id="buyer" class="tabcontent">
                <jsp:include page="buyerPage.jsp" />
            </div>
            <div id="seller" class="tabcontent">
                <jsp:include page="sellerPage.jsp" />
            </div>
            
            <!-- TODO Create Input of Sender and Receiver -->
            
            <input style="height:40px;width:130px" type="submit" value="ออกใบกำกับภาษี" name="Submit" />
        </form>    
    </body>
</html>

<script>
    document.getElementById("defaultOpen").click();
</script>
