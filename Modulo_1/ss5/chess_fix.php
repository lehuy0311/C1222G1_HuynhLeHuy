<html>

   <head>
      <title>Vẽ bàn cờ bằng PHP</title>
   </head>
   <body>

      <table width="270px" cellspacing="0px" cellpadding="0px" border="1px">

	  <!-- Ô có độ rộng 270px (8 cột x 60px) -->
      <?php
      for($row=1; $row <= 8; $row++)
      {
          echo "<tr>";
          for($col=1; $col <=8; $col++)
          {
            $total=$row + $col;
            if($total%2 == 0)
            {
              echo "<td height=30px width=30px bgcolor=#FFFFFF></td>";
            }
            else
            {
              echo "<td height=30px width=30px bgcolor=#000000></td>";
            }
          }
          echo "</tr>";  
      }
      ?>
     </table>

   </body>
</html>


//note: step 1: open xampp control
//      step 2: open apache
//      step 3: add chess_fix.php in htdocs
//      step 4: run http://localhost:8080/chess_fix.php