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
            <button class="tab-links" onclick="changeCompanyTab(event, 'buyer')" id="defaultOpen">ผู้ซื้อ</button>
            <button class="tab-links" onclick="changeCompanyTab(event, 'seller')">ผู้ขาย</button>
        </div>
        <form action="#" method="post">
            <div id="buyer" class="tab-content">
                <jsp:include page="buyerPage.jsp" />
            </div>
            <div id="seller" class="tab-content">
                <jsp:include page="sellerPage.jsp" />
            </div>
            
            <!-- TODO Create Input of Sender and Receiver -->
            
            <button class="btn" name="submit">ออกใบกำกับภาษี</button>
        </form>    
    </body>
</html>

<script>
    document.getElementById("defaultOpen").click();
</script>
