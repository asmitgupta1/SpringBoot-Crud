<%@page language="java" %>

<html>
    <body>
        <h2> Hello World </h2>

        <form action="/result">
          <label for="sid">SID:</label><br>
          <input type="text" id="sid" name="fname" value="John"><br>
          <label for="sname">Student name:</label><br>
          <input type="text" id="sname" name="sname" value="sname"><br><br>
          <label for="Marks">Marks:</label><br>
          <input type="text" id="marks" name="marks" value="Marks"><br><br>
          <input type="submit" value="Submit">
        </form>
    </body>
</html>
