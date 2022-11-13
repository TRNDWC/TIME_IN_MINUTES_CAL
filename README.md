## TIME_IN_MINUTES_CAL

#1 lambda expression
  lambda expression là 1 functions that are not declared but are passed immediately as an expression
    vd: max(string,{a,b->a.length<b.length}) la 1 ham cap cao co para so 2 la 1 ham ko dc declare
    
  full syntax of a lambda expression is
    val name: (A,B) -> C = { para1: A, para2: B -> the function}
            . 1 lambda expression luon duoc boc trong 1 {}
            . neu kieu tra ve cua lambda khong phai la Unit, 
              thi bieu dien cuoi trong lambda body dc coi nhu kieu tra ve
              
  passing trailing lambdas
    khu ma para cuoi cua 1 ham co kieu la function thi lambda expresion co the dung nhu 1 doi so tuong ung
    neu nhu ham cho co 1 para thi lambda expresion thi cta co the dung tu 'it' va '->' co the duoc bo 
  '_' cho nhung bien khong dung den 
  
  lambda co tinh dong goi vi cac bien co the duoc khia boa ngoai ham
    vd: var sum = 0
        ints.filter { it > 0 }.forEach {
            sum += it
         }
        print(sum)
        
       
       
lop Calendar
  getInstance() : tao ra 1 object mang kieu Calendar
  get(Calendar.'XXX') : de lay gia tri XXX cua object dang dc xet
  
lop DatePickerDialog
      gom 5 parameter = bien, lambda expression, year, month, dayofmonth
      lambda expression trong cau tren duoc goi la ondatesetlistener 
      nhan vao 4 tham so _, selectedYear, selectedMonth, selectedDay va tra ve body kieu function
      lop con datePicker
              . Maxdate: set lua chon lon nhat cho lich
lop SimpleDateFormat      
      dung de dinh dang lai ngay gio
      ham parse: chuyen tu sinh sang dinh dang ngay gio
      ham format: dinh dang lai object sang kieu string
      System.currentTimeMillis() : lay thoi gian tra ve thoi gian hien tai o dang milli giay
      
  
