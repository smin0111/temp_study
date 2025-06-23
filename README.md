<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>실습문제_01</title>
</head>
<body>
    <form action="#">
        <fieldset>
            <legend>납품자 정보</legend>
            <br>
            <label >1. 납품자명 : </label>
            <input type="text">
            <br> <br>
            <label >2. email : </label>
            <input type="email" name="email" placeholder="answer@naver.com">
            <br><br>
            <label >3. 홈페이지 : </label>
            <input type="url" name="homepage" value="http://">
            <br><br>
            <label >4. 지역 : </label>
            <select name="nation" id="">
                <option value="서울">서울</option>
                <option value="경기">경기</option>
                <option value="부산">부산</option>
                <option value="부산" selected>부산</option>
            </select>
            <br><br>

        </fieldset>
        <fieldset>
            <legend>납품 정보</legend>
            <ul>
                <li> 상품명 : <input type="text"></li>
                <br>
                <li> 납품수량 : <input type="text" placeholder="최소 100" min="100" max="10000"></li>
                <br>
                <li> 납품등급 :  <input type="range" name="point" min="0" max="2" value="1" step="1"></li>
                <br>
                <li> 기타사항 : <textarea cols="20" rows="5"></textarea></li>
                <br>

            </ul>
        </fieldset>
        <br>
        <input type="submit" value="send message">
    </form>
    
</body>
</html>
