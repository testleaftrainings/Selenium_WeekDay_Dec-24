week5.day1:
 -> Read Excel Program
 -> Breakout+Break
 -> Excel Integrations with TestCase
 -> Breakout
 -> Common Integration 




How to read data from Excel:

its not  mandatory to have excel in system

Excel:
Login.xls= -> Microsoft excel spreadsheet
Login.xlsx -> Microsoft excel spreadsheet in xml format

XSSF-> XML SpreadSheet Format


Step1-> Set path for workbook
step2-> Get into the sheet
Step3-> Get into Row values
Step4-> Get into cell values
Step5-> Read Data from workbook and print
Step6-> close the workbook


# Steps to do Excel Integration:
1. Create 2- dimensional array in the ReadEXcel Class with rowCount and columnCount
String[][] data = new String[rowCount][columnCount];
2. Push stringCellValue to the Array
DataProvider what index value it will be started - 0
Excel program what index value for row - 1

convert excel into DataProvider
data[i-1][j]=stringCellValue;


3. Close the workbook and return the data
wBook.close();
return data;
4. Change main method to a normal static method -retrain the static keyword
public static String[][] readExcel(){
}
5. Inside the testcase within the sendData() call the readExcel() from ReadExcel Class and return the data
@DataProvider(name="fetchData")
public String[][] sendData() throws IOException {
    
return ReadExcel.readExcel();



6.
 inside excel program craete one input agrs and pass variable inside workbook
 (./data/"+fileName+".xlsx)
 
 
 into the BaseClass or PSM  and declare a fileName globally
 public String fileName; ------------ > Global declaration
@DataProvider(name="fetchData")
public String[][] sendData() throws IOException {
return ReadExcel.readExcel(fileName); 
}
7. Create setValues() inside each testcase and annotate with @BeforeTest and mention the filename here
@BeforeTest
public void setValues() {
fileName="EditLead";
} 
8. Finally , run from the xml file