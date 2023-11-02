package com.jpa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       JpaCrudOpration jpa=new JpaCrudOpration();
//       Person p2=new Person();
//       p2.setId(3);
//       p2.setName("janaki");
//       p2.setAge(54);
//       p2.setEmail("janaki@gmail.com");
//       jpa.insertRecord(p2);
       //jpa.deleteRecord(1);
       //jpa.findRecordById(2);
       //jpa.updateRecord(0, "manyav", 14);
       jpa.retrievAll();
       
    }
}
