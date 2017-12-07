<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ออกใบกำกับภาษีอิเล็กทรอนิกส์</title>
    </head>
    <body>
        <form action="#" method="post">
            <h2>ผู้ซื้อ</h2>
            <h4>
            <table width="400">
                <tr>
                    <td>รหัสผู้ค้า</td>
                    <td><input type="text" name="id" size="30" /></td>
                </tr>
                <tr>
                    <td>รหัสผู้ค้าสากล</td>
                    <td><input type="text" name="globalId" size="30" /></td>
                </tr> 
                <tr>
                    <td>ชื่อผู้ซื้อ</td>
                    <td><input type="text" name="name" size="30" /></td>
                </tr>
                <tr>
                    <td>อีเมล</td>
                    <td><input type="text" name="email" value="" size="30" /></td>
                </tr>
                <tr>
                    <td>เลขประจำตัวผู้เสียภาษีอากร</td>
                    <td><input type="text" name="name" size="30" /></td>
                </tr>    
            </table>
            
            <!-- TODO Create Input of Buyer Address -->    
                
            </h4>
            <h2>ผู้ขาย</h2>
            <h4>
            <table width="400">
                <tr>
                    <td>รหัสผู้ค้า</td>
                    <td><input type="text" name="id" size="30" /></td>
                </tr>
                <tr>
                    <td>รหัสผู้ค้าสากล</td>
                    <td><input type="text" name="globalId" size="30" /></td>
                </tr> 
                <tr>
                    <td>ชื่อผู้ขาย</td>
                    <td><input type="text" name="name" size="30" /></td>
                </tr>
                <tr>
                    <td>อีเมล</td>
                    <td><input type="text" name="email" value="" size="30" /></td>
                </tr>
                <tr>
                    <td>เลขประจำตัวผู้เสียภาษีอากร</td>
                    <td><input type="text" name="name" size="30" /></td>
                </tr>    
            </table>
            </h4> 
            
            <!-- TODO Create Input of Seller Address -->
            
            <!-- TODO Create Input of Sender and Receiver -->
            
            <input type="submit" value="ออกใบกำกับภาษี" name="Submit" />
        </form>    
    </body>
</html>

