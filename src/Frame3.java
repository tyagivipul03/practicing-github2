
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Frame3 extends javax.swing.JFrame {

    /**
     * Creates new form Frame3
     */
    public Frame3() {
        initComponents();
         setLocation(500,200);
         getContentPane().setBackground(new Color(20,100,220));
         t1.setEnabled(false);
         cb2.setEnabled(false);
         cb3.setEnabled(false);
         
         
    }
int z=0;
  void f1(KeyEvent evt){
      char c=evt.getKeyChar();
      String s =t1.getText();
      try{ if(c=='\u0008'){
         if(s.equals(""))
             l1.setText("");
         if((cb1.getSelectedItem()=="Angle")){
        if(cb2.getSelectedItem()=="Degree") {
            if(cb3.getSelectedItem()=="Degree"){
             String s1=s+c;
             double d=Double.parseDouble(s1); 
            l1.setText(d+"");

            }
            if(cb3.getSelectedItem()=="Gradian"){
                String s1=s+c;
               
                double d=Double.parseDouble(s1);
                double g=d*1.111111;
                l1.setText(g+"");
            }
            if(cb3.getSelectedItem()=="Radian"){
                String s1=s+c;
                double d=Double.parseDouble(s1);
                double r=Math.toRadians(d);
                l1.setText(r+"");
            }
        } 
        if(cb2.getSelectedItem()=="Gradian"){
           if(cb3.getSelectedItem()=="Degree"){
               String s1=s+c;
               double g=Double.parseDouble(s1);
               double d=0.9*g;
               l1.setText(d+"");
           }
           if(cb3.getSelectedItem()=="Gradian"){
               String s1=s+c;
             double g=Double.parseDouble(s1); 
            l1.setText(g+"");
           }
           if(cb3.getSelectedItem()=="Radian"){
            String s1=s+c;
            double g=Double.parseDouble(s1);
            double r=0.015707964*g;
            l1.setText(r+"");
           }

        }
        if(cb2.getSelectedItem()=="Radian"){
            if(cb3.getSelectedItem()=="Degree"){
                String s1=s+c;
                double r=Double.parseDouble(s1); 
                double d=Math.toDegrees(r);
                l1.setText(d+"");
            }
             if(cb3.getSelectedItem()=="Gradian"){
                String s1=s+c;
                double r=Double.parseDouble(s1); 
                double g=63.662*r;
                l1.setText(g+"");
            }
              if(cb3.getSelectedItem()=="Radian"){
                  String s1=s+c;
             double r=Double.parseDouble(s1); 
            l1.setText(r+"");
              } 
        }
      }
      if(cb1.getSelectedItem()=="Area"){
          if(cb2.getSelectedItem()=="Acres"){
              if(cb3.getSelectedItem()=="Acres"){
                   String s1=s+c;
             double a=Double.parseDouble(s1); 
            l1.setText(a+""); 
              }
               if(cb3.getSelectedItem()=="Hectares"){
                String s1=s+c;
                double a=Double.parseDouble(s1); 
                double h=0.404686*a;
                l1.setText(h+"");
               }
                if(cb3.getSelectedItem()=="Square Centimeter"){
                String s1=s+c;
                double a=Double.parseDouble(s1); 
                double sc=40468564.224*a;
                l1.setText(sc+"");
               }
                 if(cb3.getSelectedItem()=="Square Feet"){
                String s1=s+c;
                double a=Double.parseDouble(s1); 
                double f=43560*a;
                l1.setText(f+"");
               }
                if(cb3.getSelectedItem()=="Square Inch"){
                String s1=s+c;
                double a=Double.parseDouble(s1); 
                double si=6272640*a;
                l1.setText(si+"");
               } 
                if(cb3.getSelectedItem()=="Square Kilometer"){
                String s1=s+c;
                double a=Double.parseDouble(s1); 
                double sk=0.00404686*a;
                l1.setText(sk+"");
               }
               if(cb3.getSelectedItem()=="Square Meter"){
                String s1=s+c;
                double a=Double.parseDouble(s1); 
                double sm=4046.86*a;
                l1.setText(sm+"");
               }   
                
          }
           if(cb2.getSelectedItem()=="Hectares"){
              if(cb3.getSelectedItem()=="Acres"){
                   String s1=s+c;
                double h=Double.parseDouble(s1); 
                double a=2.47105*h;
                l1.setText(a+"");
              }
               if(cb3.getSelectedItem()=="Hectares"){
                     String s1=s+c;
             double h=Double.parseDouble(s1); 
            l1.setText(h+""); 
                
               }
                if(cb3.getSelectedItem()=="Square Centimeter"){
                String s1=s+c;
                double h=Double.parseDouble(s1); 
                double sc=100000000*h;
                l1.setText(sc+"");
               }
                 if(cb3.getSelectedItem()=="Square Feet"){
                String s1=s+c;
                double h=Double.parseDouble(s1); 
                double f=107639*h;
                l1.setText(f+"");
               }
                if(cb3.getSelectedItem()=="Square Inch"){
                String s1=s+c;
                double h=Double.parseDouble(s1); 
                double si=15500031.000062 *h;
                l1.setText(si+"");
               } 
                if(cb3.getSelectedItem()=="Square Kilometer"){
                String s1=s+c;
                double h=Double.parseDouble(s1); 
                double sk=0.01*h;
                l1.setText(sk+"");
               }
               if(cb3.getSelectedItem()=="Square Meter"){
                String s1=s+c;
                double h=Double.parseDouble(s1); 
                double sm=10000*h;
                l1.setText(sm+"");
               }   
                
          }
           if(cb2.getSelectedItem()=="Square Centimeter"){
              if(cb3.getSelectedItem()=="Acres"){
                   String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double a=0.000000024710538146717*sc;
                l1.setText(a+"");
              }
               if(cb3.getSelectedItem()=="Hectares"){
                String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double h=0.000000010*sc;
                l1.setText(h+""); 
                
               }
                if(cb3.getSelectedItem()=="Square Centimeter"){
                     String s1=s+c;
             double sc=Double.parseDouble(s1); 
            l1.setText(sc+"");
                
               }
                 if(cb3.getSelectedItem()=="Square Feet"){
                String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double f=0.001076391041671*sc;
                l1.setText(f+"");
               }
                if(cb3.getSelectedItem()=="Square Inch"){
                String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double si=0.15500031000062*sc;
                l1.setText(si+"");
               } 
                if(cb3.getSelectedItem()=="Square Kilometer"){
                String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double sk=0.00000000010*sc;
                l1.setText(sk+"");
               }
               if(cb3.getSelectedItem()=="Square Meter"){
                String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double sm=0.0001*sc;
                l1.setText(sm+"");
               }   
                
          }
            if(cb2.getSelectedItem()=="Square Feet"){
              if(cb3.getSelectedItem()=="Acres"){
                   String s1=s+c;
                double f=Double.parseDouble(s1); 
                double a=0.000022956841138659*f;
                l1.setText(a+"");
              }
               if(cb3.getSelectedItem()=="Hectares"){
                String s1=s+c;
                double f=Double.parseDouble(s1); 
                double h=0.000009290304*f;
                l1.setText(h+""); 
                
               }
                if(cb3.getSelectedItem()=="Square Centimeter"){
                  String s1=s+c;
                double f=Double.parseDouble(s1); 
                double sc=929.0304*f;
                l1.setText(sc+"");    
                
               }
                 if(cb3.getSelectedItem()=="Square Feet"){
                       String s1=s+c;
             double f=Double.parseDouble(s1); 
            l1.setText(f+"");
               
               }
                if(cb3.getSelectedItem()=="Square Inch"){
                String s1=s+c;
                double f=Double.parseDouble(s1); 
                double si=144*f;
                l1.setText(si+"");
               } 
                if(cb3.getSelectedItem()=="Square Kilometer"){
                String s1=s+c;
                double f=Double.parseDouble(s1); 
                double sk=0.00000009290304*f;
                l1.setText(sk+"");
               }
               if(cb3.getSelectedItem()=="Square Meter"){
                String s1=s+c;
                double f=Double.parseDouble(s1); 
                double sm=0.09290304*f;
                l1.setText(sm+"");
               }   
                
          }
             if(cb2.getSelectedItem()=="Square Inch"){
              if(cb3.getSelectedItem()=="Acres"){
                   String s1=s+c;
                double si=Double.parseDouble(s1); 
                double a=0.00000015942250790736*si;
                l1.setText(a+"");
              }
               if(cb3.getSelectedItem()=="Hectares"){
                String s1=s+c;
                double si=Double.parseDouble(s1); 
                double h=0.000000064516*si;
                l1.setText(h+""); 
                
               }
                if(cb3.getSelectedItem()=="Square Centimeter"){
                  String s1=s+c;
                double si=Double.parseDouble(s1); 
                double sc=6.4516*si;
                l1.setText(sc+"");    
                
               }
                 if(cb3.getSelectedItem()=="Square Feet"){
                     String s1=s+c;
                double si=Double.parseDouble(s1); 
                double f=0.0069444444444444*si;
                l1.setText(f+"");
                     
               
               }
                if(cb3.getSelectedItem()=="Square Inch"){
                  String s1=s+c;
             double si=Double.parseDouble(s1); 
            l1.setText(si+"");
               } 
                if(cb3.getSelectedItem()=="Square Kilometer"){
                String s1=s+c;
                double si=Double.parseDouble(s1); 
                double sk=0.00000000064516*si;
                l1.setText(sk+"");
               }
               if(cb3.getSelectedItem()=="Square Meter"){
                String s1=s+c;
                double si=Double.parseDouble(s1); 
                double sm=0.00064516*si;
                l1.setText(sm+"");
               }   
                
          }
              if(cb2.getSelectedItem()=="Square Kilometer"){
              if(cb3.getSelectedItem()=="Acres"){
                   String s1=s+c;
                double sk=Double.parseDouble(s1); 
                double a=247.10538146717*sk;
                l1.setText(a+"");
              }
               if(cb3.getSelectedItem()=="Hectares"){
                String s1=s+c;
                double sk=Double.parseDouble(s1); 
                double h=100*sk;
                l1.setText(h+""); 
                
               }
                if(cb3.getSelectedItem()=="Square Centimeter"){
                  String s1=s+c;
                double sk=Double.parseDouble(s1); 
                double sc=10000000000d*sk;
                l1.setText(sc+"");    
                
               }
                 if(cb3.getSelectedItem()=="Square Feet"){
                     String s1=s+c;
                double sk=Double.parseDouble(s1); 
                double f=10763910.41671*sk;
                l1.setText(f+"");
                     
               
               }
                if(cb3.getSelectedItem()=="Square Inch"){
                String s1=s+c;
                double sk=Double.parseDouble(s1); 
                double si=1550003100.0062*sk;
                l1.setText(si+"");
               } 
                if(cb3.getSelectedItem()=="Square Kilometer"){
                     String s1=s+c;
             double sk=Double.parseDouble(s1); 
            l1.setText(sk+"");
                
               }
               if(cb3.getSelectedItem()=="Square Meter"){
                String s1=s+c;
                double sk=Double.parseDouble(s1); 
                double sm=1000000*sk;
                l1.setText(sm+"");
               }   
                
          }
              if(cb2.getSelectedItem()=="Square Meter"){
              if(cb3.getSelectedItem()=="Acres"){
                   String s1=s+c;
                double sm=Double.parseDouble(s1); 
                double a=0.00024710538146717*sm;
                l1.setText(a+"");
              }
               if(cb3.getSelectedItem()=="Hectares"){
                String s1=s+c;
                double sm=Double.parseDouble(s1); 
                double h=0.0001*sm;
                l1.setText(h+""); 
                
               }
                if(cb3.getSelectedItem()=="Square Centimeter"){
                  String s1=s+c;
                double sm=Double.parseDouble(s1); 
                double sc=10000*sm;
                l1.setText(sc+"");    
                
               }
                 if(cb3.getSelectedItem()=="Square Feet"){
                     String s1=s+c;
                double sm=Double.parseDouble(s1); 
                double f=10.76391041671*sm;
                l1.setText(f+"");
                     
               
               }
                if(cb3.getSelectedItem()=="Square Inch"){
                String s1=s+c;
                double sm=Double.parseDouble(s1); 
                double si=1550.0031000062*sm;
                l1.setText(si+"");
               } 
                if(cb3.getSelectedItem()=="Square Kilometer"){
                   String s1=s+c;
                double sm=Double.parseDouble(s1); 
                double sk=0.0000010*sm;
                l1.setText(sk+"");  
                
               }
               if(cb3.getSelectedItem()=="Square Meter"){
                      String s1=s+c;
             double sm=Double.parseDouble(s1); 
            l1.setText(sm+"");
              
               }   
                
          }
      }
       if(cb1.getSelectedItem()=="Length"){
          if(cb2.getSelectedItem()=="Centimeter"){
              if(cb3.getSelectedItem()=="Centimeter"){
                    String s1=s+c;
             double cm=Double.parseDouble(s1); 
            l1.setText(cm+""); 
              }
               if(cb3.getSelectedItem()=="Feet"){
                String s1=s+c;
                double cm=Double.parseDouble(s1); 
                double ft= 0.0328084*cm;
                l1.setText(ft+"");
               }
                if(cb3.getSelectedItem()=="Inch"){
                String s1=s+c;
                double cm=Double.parseDouble(s1); 
                double i=0.393701*cm;
                l1.setText(i+"");
               }
                 if(cb3.getSelectedItem()=="Kilometer"){
                String s1=s+c;
                double cm=Double.parseDouble(s1); 
                double km=0.00001*cm;
                l1.setText(km+"");
               }
                if(cb3.getSelectedItem()=="Meter"){
                String s1=s+c;
                double cm=Double.parseDouble(s1); 
                double m=0.01*cm;
                l1.setText(m+"");
               } 
                if(cb3.getSelectedItem()=="Mile"){
                String s1=s+c;
                double cm=Double.parseDouble(s1); 
                double ml=0.000006213*cm;
                l1.setText(ml+"");
               }
               if(cb3.getSelectedItem()=="Yard"){
                String s1=s+c;
                double cm=Double.parseDouble(s1); 
                double y=0.0109361*cm;
                l1.setText(y+"");
               }   
                
          }
          if(cb2.getSelectedItem()=="Feet"){
              if(cb3.getSelectedItem()=="Centimeter"){
                String s1=s+c;
                double ft=Double.parseDouble(s1); 
                double cm= 30.48*ft;
                l1.setText(cm+"");  
              }
               if(cb3.getSelectedItem()=="Feet"){
                     String s1=s+c;
             double ft=Double.parseDouble(s1); 
            l1.setText(ft+"");
                
               }
                if(cb3.getSelectedItem()=="Inch"){
                String s1=s+c;
                double ft=Double.parseDouble(s1); 
                double i=12*ft;
                l1.setText(i+"");
               }
                 if(cb3.getSelectedItem()=="Kilometer"){
                String s1=s+c;
                double ft=Double.parseDouble(s1); 
                double km=0.0003048*ft;
                l1.setText(km+"");
               }
                if(cb3.getSelectedItem()=="Meter"){
                String s1=s+c;
                double ft=Double.parseDouble(s1); 
                double m=0.3048*ft;
                l1.setText(m+"");
               } 
                if(cb3.getSelectedItem()=="Mile"){
                String s1=s+c;
                double ft=Double.parseDouble(s1); 
                double ml=0.0001894*ft;
                l1.setText(ml+"");
               }
               if(cb3.getSelectedItem()=="Yard"){
                String s1=s+c;
                double ft=Double.parseDouble(s1); 
                double y=0.33333*ft;
                l1.setText(y+"");
               }   
                
          }
          if(cb2.getSelectedItem()=="Inch"){
              if(cb3.getSelectedItem()=="Centimeter"){
                String s1=s+c;
                double i=Double.parseDouble(s1); 
                double cm= 2.54*i;
                l1.setText(cm+"");  
              }
               if(cb3.getSelectedItem()=="Feet"){
                String s1=s+c;
                double i=Double.parseDouble(s1); 
                double ft=0.08333*i;
                l1.setText(ft+"");  
                
               }
                if(cb3.getSelectedItem()=="Inch"){
                       String s1=s+c;
             double i=Double.parseDouble(s1); 
            l1.setText(i+"");
                
               }
                 if(cb3.getSelectedItem()=="Kilometer"){
                String s1=s+c;
                double i=Double.parseDouble(s1); 
                double km=0.0000254*i;
                l1.setText(km+"");
               }
                if(cb3.getSelectedItem()=="Meter"){
                String s1=s+c;
                double i=Double.parseDouble(s1); 
                double m=0.0254*i;
                l1.setText(m+"");
               } 
                if(cb3.getSelectedItem()=="Mile"){
                String s1=s+c;
                double i=Double.parseDouble(s1); 
                double ml=0.000015782829*i;
                l1.setText(ml+"");
               }
               if(cb3.getSelectedItem()=="Yard"){
                String s1=s+c;
                double i=Double.parseDouble(s1); 
                double y=0.027777778*i;
                l1.setText(y+"");
               }   
                
          }
           if(cb2.getSelectedItem()=="Kilometer"){
              if(cb3.getSelectedItem()=="Centimeter"){
                String s1=s+c;
                double km=Double.parseDouble(s1); 
                double cm= 100000*km;
                l1.setText(cm+"");  
              }
               if(cb3.getSelectedItem()=="Feet"){
                String s1=s+c;
                double km=Double.parseDouble(s1); 
                double ft=3280.8398*km;
                l1.setText(ft+"");  
                
               }
                if(cb3.getSelectedItem()=="Inch"){
                   String s1=s+c;
                double km=Double.parseDouble(s1); 
                double i=39370.08*km;
                l1.setText(i+"");  
                
               }
                 if(cb3.getSelectedItem()=="Kilometer"){
                        String s1=s+c;
             double km=Double.parseDouble(s1); 
            l1.setText(km+"");
              
               }
                if(cb3.getSelectedItem()=="Meter"){
                String s1=s+c;
                double km=Double.parseDouble(s1); 
                double m=1000*km;
                l1.setText(m+"");
               } 
                if(cb3.getSelectedItem()=="Mile"){
                String s1=s+c;
                double km=Double.parseDouble(s1); 
                double ml=0.6213712*km;
                l1.setText(ml+"");
               }
               if(cb3.getSelectedItem()=="Yard"){
                String s1=s+c;
                double km=Double.parseDouble(s1); 
                double y=1093.6133*km;
                l1.setText(y+"");
               }   
                
          }
            if(cb2.getSelectedItem()=="Meter"){
              if(cb3.getSelectedItem()=="Centimeter"){
                String s1=s+c;
                double m=Double.parseDouble(s1); 
                double cm= 100*m;
                l1.setText(cm+"");  
              }
               if(cb3.getSelectedItem()=="Feet"){
                String s1=s+c;
                double m=Double.parseDouble(s1); 
                double ft=3.28084*m;
                l1.setText(ft+"");  
                
               }
                if(cb3.getSelectedItem()=="Inch"){
                   String s1=s+c;
                double m=Double.parseDouble(s1); 
                double i=39.37008*m;
                l1.setText(i+"");  
                
               }
                 if(cb3.getSelectedItem()=="Kilometer"){
                   String s1=s+c;
                double m=Double.parseDouble(s1); 
                double km=0.001*m;
                l1.setText(km+"");     
              
               }
                if(cb3.getSelectedItem()=="Meter"){
                       String s1=s+c;
             double m=Double.parseDouble(s1); 
            l1.setText(m+"");
               
               } 
                if(cb3.getSelectedItem()=="Mile"){
                String s1=s+c;
                double m=Double.parseDouble(s1); 
                double ml=0.0006213712*m;
                l1.setText(ml+"");
               }
               if(cb3.getSelectedItem()=="Yard"){
                String s1=s+c;
                double m=Double.parseDouble(s1); 
                double y=1.0936133*m;
                l1.setText(y+"");
               }   
                
          }
              if(cb2.getSelectedItem()=="Mile"){
              if(cb3.getSelectedItem()=="Centimeter"){
                String s1=s+c;
                double ml=Double.parseDouble(s1); 
                double cm= 160934.4*ml;
                l1.setText(cm+"");  
              }
               if(cb3.getSelectedItem()=="Feet"){
                String s1=s+c;
                double ml=Double.parseDouble(s1); 
                double ft=5280*ml;
                l1.setText(ft+"");  
                
               }
                if(cb3.getSelectedItem()=="Inch"){
                   String s1=s+c;
                double ml=Double.parseDouble(s1); 
                double i=63360*ml;
                l1.setText(i+"");  
                
               }
                 if(cb3.getSelectedItem()=="Kilometer"){
                   String s1=s+c;
                double ml=Double.parseDouble(s1); 
                double km=1.609344*ml;
                l1.setText(km+"");     
              
               }
                if(cb3.getSelectedItem()=="Meter"){
                  String s1=s+c;
                double ml=Double.parseDouble(s1); 
                double m=1609.344*ml;
                l1.setText(m+"");   
               
               } 
                if(cb3.getSelectedItem()=="Mile"){
                      String s1=s+c;
             double ml=Double.parseDouble(s1); 
            l1.setText(ml+"");
               
               }
               if(cb3.getSelectedItem()=="Yard"){
                String s1=s+c;
                double ml=Double.parseDouble(s1); 
                double y=1760*ml;
                l1.setText(y+"");
               }   
                
          }
            if(cb2.getSelectedItem()=="Yard"){
              if(cb3.getSelectedItem()=="Centimeter"){
                String s1=s+c;
                double y=Double.parseDouble(s1); 
                double cm=91.44*y;
                l1.setText(cm+"");  
              }
               if(cb3.getSelectedItem()=="Feet"){
                String s1=s+c;
                double y=Double.parseDouble(s1); 
                double ft=3*y;
                l1.setText(ft+"");  
                
               }
                if(cb3.getSelectedItem()=="Inch"){
                   String s1=s+c;
                double y=Double.parseDouble(s1); 
                double i=36*y;
                l1.setText(i+"");  
                
               }
                 if(cb3.getSelectedItem()=="Kilometer"){
                   String s1=s+c;
                double y=Double.parseDouble(s1); 
                double km=0.0009144*y;
                l1.setText(km+"");     
              
               }
                if(cb3.getSelectedItem()=="Meter"){
                  String s1=s+c;
                double y=Double.parseDouble(s1); 
                double m=0.9144*y;
                l1.setText(m+"");   
               
               } 
                if(cb3.getSelectedItem()=="Mile"){
                String s1=s+c;
                double y=Double.parseDouble(s1); 
                double ml=0.0005681818*y;
                l1.setText(ml+"");    
               
               }
               if(cb3.getSelectedItem()=="Yard"){
                     String s1=s+c;
             double y=Double.parseDouble(s1); 
            l1.setText(y+"");
                
               }   
                
          }   
       }
       if(cb1.getSelectedItem()=="Time"){
          if(cb2.getSelectedItem()=="Day"){
              if(cb3.getSelectedItem()=="Day"){
                   String s1=s+c;
             double d=Double.parseDouble(s1); 
            l1.setText(d+"");
              }
               if(cb3.getSelectedItem()=="Hours"){
                String s1=s+c;
                double d=Double.parseDouble(s1); 
                double hs=24*d;
                l1.setText(hs+"");
               }
                if(cb3.getSelectedItem()=="Microsecond"){
                String s1=s+c;
                double d=Double.parseDouble(s1); 
                double ms=0.000000000864*d;
                l1.setText(ms+"");
               }
                 if(cb3.getSelectedItem()=="Millisecond"){
                String s1=s+c;
                double d=Double.parseDouble(s1); 
                double mls=0.000000864*d;
                l1.setText(mls+"");
               }
                if(cb3.getSelectedItem()=="Minute"){
                String s1=s+c;
                double d=Double.parseDouble(s1); 
                double mn=1440*d;
                l1.setText(mn+"");
               } 
                if(cb3.getSelectedItem()=="Second"){
                String s1=s+c;
                double d=Double.parseDouble(s1); 
                double sc=86400*d;
                l1.setText(sc+"");
               }
               if(cb3.getSelectedItem()=="Week"){
                String s1=s+c;
                double d=Double.parseDouble(s1); 
                double w=0.14285715*d;
                l1.setText(w+"");
               }   
                
          }
          if(cb2.getSelectedItem()=="Hours"){
              if(cb3.getSelectedItem()=="Day"){
                String s1=s+c;
                double hs=Double.parseDouble(s1); 
                double d=0.041666668*hs;
                l1.setText(d+"");  
              }
               if(cb3.getSelectedItem()=="Hours"){
                      String s1=s+c;
             double hs=Double.parseDouble(s1); 
            l1.setText(hs+"");
               
               }
                if(cb3.getSelectedItem()=="Microsecond"){
                String s1=s+c;
                double hs=Double.parseDouble(s1); 
                double ms=0.0000000036*hs;
                l1.setText(ms+"");
               }
                 if(cb3.getSelectedItem()=="Millisecond"){
                String s1=s+c;
                double hs=Double.parseDouble(s1); 
                double mls=3600000*hs;
                l1.setText(mls+"");
               }
                if(cb3.getSelectedItem()=="Minute"){
                String s1=s+c;
                double hs=Double.parseDouble(s1); 
                double mn=60*hs;
                l1.setText(mn+"");
               } 
                if(cb3.getSelectedItem()=="Second"){
                String s1=s+c;
                double hs=Double.parseDouble(s1); 
                double sc=3600*hs;
                l1.setText(sc+"");
               }
               if(cb3.getSelectedItem()=="Week"){
                String s1=s+c;
                double hs=Double.parseDouble(s1); 
                double w=0.005952381*hs;
                l1.setText(w+"");
               }   
                
          }
           if(cb2.getSelectedItem()=="Microsecond"){
              if(cb3.getSelectedItem()=="Day"){
                String s1=s+c;
                double ms=Double.parseDouble(s1); 
                double d=0.000000000011574074*ms;
                l1.setText(d+"");  
              }
               if(cb3.getSelectedItem()=="Hours"){
                  String s1=s+c;
                double ms=Double.parseDouble(s1); 
                double hs=0.00000000027777777*ms;
                l1.setText(hs+"");   
               
               }
                if(cb3.getSelectedItem()=="Microsecond"){
                       String s1=s+c;
             double ms=Double.parseDouble(s1); 
            l1.setText(ms+"");
              
               }
                 if(cb3.getSelectedItem()=="Millisecond"){
                String s1=s+c;
                double ms=Double.parseDouble(s1); 
                double mls=0.001*ms;
                l1.setText(mls+"");
               }
                if(cb3.getSelectedItem()=="Minute"){
                String s1=s+c;
                double ms=Double.parseDouble(s1); 
                double mn=0.000000016666666*ms;
                l1.setText(mn+"");
               } 
                if(cb3.getSelectedItem()=="Second"){
                String s1=s+c;
                double ms=Double.parseDouble(s1); 
                double sc=0.000001*ms;
                l1.setText(sc+"");
               }
               if(cb3.getSelectedItem()=="Week"){
                String s1=s+c;
                double ms=Double.parseDouble(s1); 
                double w=0.0000000000016534391*ms;
                l1.setText(w+"");
               }   
                
          }
           if(cb2.getSelectedItem()=="Millisecond"){
              if(cb3.getSelectedItem()=="Day"){
                String s1=s+c;
                double mls=Double.parseDouble(s1); 
                double d=0.000000011574074*mls;
                l1.setText(d+"");  
              }
               if(cb3.getSelectedItem()=="Hours"){
                  String s1=s+c;
                double mls=Double.parseDouble(s1); 
                double hs=0.0000002777778*mls;
                l1.setText(hs+"");   
               
               }
                if(cb3.getSelectedItem()=="Microsecond"){
                 String s1=s+c;
                double mls=Double.parseDouble(s1); 
                double ms=1000*mls;
                l1.setText(ms+"");   
              
               }
                 if(cb3.getSelectedItem()=="Millisecond"){
                        String s1=s+c;
             double mls=Double.parseDouble(s1); 
            l1.setText(mls+"");
                
               }
                if(cb3.getSelectedItem()=="Minute"){
                String s1=s+c;
                double mls=Double.parseDouble(s1); 
                double mn=0.000016666667*mls;
                l1.setText(mn+"");
               } 
                if(cb3.getSelectedItem()=="Second"){
                String s1=s+c;
                double mls=Double.parseDouble(s1); 
                double sc=0.001*mls;
                l1.setText(sc+"");
               }
               if(cb3.getSelectedItem()=="Week"){
                String s1=s+c;
                double mls=Double.parseDouble(s1); 
                double w=0.0000000016534392*mls;
                l1.setText(w+"");
               }   
                
          }
           if(cb2.getSelectedItem()=="Minute"){
              if(cb3.getSelectedItem()=="Day"){
                String s1=s+c;
                double mn=Double.parseDouble(s1); 
                double d=0.00069444446*mn;
                l1.setText(d+"");  
              }
               if(cb3.getSelectedItem()=="Hours"){
                  String s1=s+c;
                double mn=Double.parseDouble(s1); 
                double hs=0.016666668*mn;
                l1.setText(hs+"");   
               
               }
                if(cb3.getSelectedItem()=="Microsecond"){
                 String s1=s+c;
                double mn=Double.parseDouble(s1); 
                double ms=0.0000006*mn;
                l1.setText(ms+"");   
              
               }
                 if(cb3.getSelectedItem()=="Millisecond"){
                 String s1=s+c;
                double mn=Double.parseDouble(s1); 
                double mls=60000*mn;
                l1.setText(mls+"");     
                
               }
                if(cb3.getSelectedItem()=="Minute"){
                      String s1=s+c;
             double mn=Double.parseDouble(s1); 
            l1.setText(mn+"");
                
               } 
                if(cb3.getSelectedItem()=="Second"){
                String s1=s+c;
                double mn=Double.parseDouble(s1); 
                double sc=60*mn;
                l1.setText(sc+"");
               }
               if(cb3.getSelectedItem()=="Week"){
                String s1=s+c;
                double mn=Double.parseDouble(s1); 
                double w=0.00009920635*mn;
                l1.setText(w+"");
               }   
                
          }
           if(cb2.getSelectedItem()=="Second"){
              if(cb3.getSelectedItem()=="Day"){
                String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double d=0.000011574074*sc;
                l1.setText(d+"");  
              }
               if(cb3.getSelectedItem()=="Hours"){
                  String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double hs=0.00027777778*sc;
                l1.setText(hs+"");   
               
               }
                if(cb3.getSelectedItem()=="Microsecond"){
                 String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double ms=1000000*sc;
                l1.setText(ms+"");   
              
               }
                 if(cb3.getSelectedItem()=="Millisecond"){
                 String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double mls=1000*sc;
                l1.setText(mls+"");     
                
               }
                if(cb3.getSelectedItem()=="Minute"){
                 String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double mn=0.016666668*sc;
                l1.setText(mn+"");   
                
               } 
                if(cb3.getSelectedItem()=="Second"){
                     String s1=s+c;
             double sc=Double.parseDouble(s1); 
            l1.setText(sc+"");
                
               }
               if(cb3.getSelectedItem()=="Week"){
                String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double w=0.0000016534392*sc;
                l1.setText(w+"");
               }   
                
          }
            if(cb2.getSelectedItem()=="Week"){
              if(cb3.getSelectedItem()=="Day"){
                String s1=s+c;
                double w=Double.parseDouble(s1); 
                double d=7*w;
                l1.setText(d+"");  
              }
               if(cb3.getSelectedItem()=="Hours"){
                  String s1=s+c;
                double w=Double.parseDouble(s1); 
                double hs=168*w;
                l1.setText(hs+"");   
               
               }
                if(cb3.getSelectedItem()=="Microsecond"){
                 String s1=s+c;
                double w=Double.parseDouble(s1); 
                double ms=0.000000000060480002*w;
                l1.setText(ms+"");   
              
               }
                 if(cb3.getSelectedItem()=="Millisecond"){
                 String s1=s+c;
                double w=Double.parseDouble(s1); 
                double mls=0.00000006048*w;
                l1.setText(mls+"");     
                
               }
                if(cb3.getSelectedItem()=="Minute"){
                 String s1=s+c;
                double w=Double.parseDouble(s1); 
                double mn=10080*w;
                l1.setText(mn+"");   
                
               } 
                if(cb3.getSelectedItem()=="Second"){
                    
                 String s1=s+c;
                double w=Double.parseDouble(s1); 
                double sc=604800*w;
                l1.setText(sc+"");
               }
               if(cb3.getSelectedItem()=="Week"){
                    String s1=s+c;
             double w=Double.parseDouble(s1); 
            l1.setText(w+"");
               
               }   
                
          }
       }
      }
      }catch(Exception ee){}
      
      if((cb2.getSelectedItem()=="---Select---")||(cb3.getSelectedItem()=="---Select---")){
          JOptionPane.showMessageDialog(this,"Please Select Both From And To Units");
          evt.consume();
      }
   try{ if(((c>47&&c<58)&&s.length()<10)||((c=='.')&&(s.indexOf(".")<0))){
      if((cb1.getSelectedItem()=="Angle")){
        if(cb2.getSelectedItem()=="Degree") {
            if(cb3.getSelectedItem()=="Degree"){
             String s1=s+c;
             double d=Double.parseDouble(s1); 
            l1.setText(d+"");

            }
            if(cb3.getSelectedItem()=="Gradian"){
                String s1=s+c;
               
                double d=Double.parseDouble(s1);
                double g=d*1.111111;
                l1.setText(g+"");
            }
            if(cb3.getSelectedItem()=="Radian"){
                String s1=s+c;
                double d=Double.parseDouble(s1);
                double r=Math.toRadians(d);
                l1.setText(r+"");
            }
        } 
        if(cb2.getSelectedItem()=="Gradian"){
           if(cb3.getSelectedItem()=="Degree"){
               String s1=s+c;
               double g=Double.parseDouble(s1);
               double d=0.9*g;
               l1.setText(d+"");
           }
           if(cb3.getSelectedItem()=="Gradian"){
               String s1=s+c;
             double g=Double.parseDouble(s1); 
            l1.setText(g+"");
           }
           if(cb3.getSelectedItem()=="Radian"){
            String s1=s+c;
            double g=Double.parseDouble(s1);
            double r=0.015707964*g;
            l1.setText(r+"");
           }

        }
        if(cb2.getSelectedItem()=="Radian"){
            if(cb3.getSelectedItem()=="Degree"){
                String s1=s+c;
                double r=Double.parseDouble(s1); 
                double d=Math.toDegrees(r);
                l1.setText(d+"");
            }
             if(cb3.getSelectedItem()=="Gradian"){
                String s1=s+c;
                double r=Double.parseDouble(s1); 
                double g=63.662*r;
                l1.setText(g+"");
            }
              if(cb3.getSelectedItem()=="Radian"){
                  String s1=s+c;
             double r=Double.parseDouble(s1); 
            l1.setText(r+"");
              } 
        }
      }
      if(cb1.getSelectedItem()=="Area"){
          if(cb2.getSelectedItem()=="Acres"){
              if(cb3.getSelectedItem()=="Acres"){
                   String s1=s+c;
             double a=Double.parseDouble(s1); 
            l1.setText(a+""); 
              }
               if(cb3.getSelectedItem()=="Hectares"){
                String s1=s+c;
                double a=Double.parseDouble(s1); 
                double h=0.404686*a;
                l1.setText(h+"");
               }
                if(cb3.getSelectedItem()=="Square Centimeter"){
                String s1=s+c;
                double a=Double.parseDouble(s1); 
                double sc=40468564.224*a;
                l1.setText(sc+"");
               }
                 if(cb3.getSelectedItem()=="Square Feet"){
                String s1=s+c;
                double a=Double.parseDouble(s1); 
                double f=43560*a;
                l1.setText(f+"");
               }
                if(cb3.getSelectedItem()=="Square Inch"){
                String s1=s+c;
                double a=Double.parseDouble(s1); 
                double si=6272640*a;
                l1.setText(si+"");
               } 
                if(cb3.getSelectedItem()=="Square Kilometer"){
                String s1=s+c;
                double a=Double.parseDouble(s1); 
                double sk=0.00404686*a;
                l1.setText(sk+"");
               }
               if(cb3.getSelectedItem()=="Square Meter"){
                String s1=s+c;
                double a=Double.parseDouble(s1); 
                double sm=4046.86*a;
                l1.setText(sm+"");
               }   
                
          }
           if(cb2.getSelectedItem()=="Hectares"){
              if(cb3.getSelectedItem()=="Acres"){
                   String s1=s+c;
                double h=Double.parseDouble(s1); 
                double a=2.47105*h;
                l1.setText(a+"");
              }
               if(cb3.getSelectedItem()=="Hectares"){
                     String s1=s+c;
             double h=Double.parseDouble(s1); 
            l1.setText(h+""); 
                
               }
                if(cb3.getSelectedItem()=="Square Centimeter"){
                String s1=s+c;
                double h=Double.parseDouble(s1); 
                double sc=100000000*h;
                l1.setText(sc+"");
               }
                 if(cb3.getSelectedItem()=="Square Feet"){
                String s1=s+c;
                double h=Double.parseDouble(s1); 
                double f=107639*h;
                l1.setText(f+"");
               }
                if(cb3.getSelectedItem()=="Square Inch"){
                String s1=s+c;
                double h=Double.parseDouble(s1); 
                double si=15500031.000062 *h;
                l1.setText(si+"");
               } 
                if(cb3.getSelectedItem()=="Square Kilometer"){
                String s1=s+c;
                double h=Double.parseDouble(s1); 
                double sk=0.01*h;
                l1.setText(sk+"");
               }
               if(cb3.getSelectedItem()=="Square Meter"){
                String s1=s+c;
                double h=Double.parseDouble(s1); 
                double sm=10000*h;
                l1.setText(sm+"");
               }   
                
          }
           if(cb2.getSelectedItem()=="Square Centimeter"){
              if(cb3.getSelectedItem()=="Acres"){
                   String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double a=0.000000024710538146717*sc;
                l1.setText(a+"");
              }
               if(cb3.getSelectedItem()=="Hectares"){
                String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double h=0.000000010*sc;
                l1.setText(h+""); 
                
               }
                if(cb3.getSelectedItem()=="Square Centimeter"){
                     String s1=s+c;
             double sc=Double.parseDouble(s1); 
            l1.setText(sc+"");
                
               }
                 if(cb3.getSelectedItem()=="Square Feet"){
                String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double f=0.001076391041671*sc;
                l1.setText(f+"");
               }
                if(cb3.getSelectedItem()=="Square Inch"){
                String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double si=0.15500031000062*sc;
                l1.setText(si+"");
               } 
                if(cb3.getSelectedItem()=="Square Kilometer"){
                String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double sk=0.00000000010*sc;
                l1.setText(sk+"");
               }
               if(cb3.getSelectedItem()=="Square Meter"){
                String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double sm=0.0001*sc;
                l1.setText(sm+"");
               }   
                
          }
            if(cb2.getSelectedItem()=="Square Feet"){
              if(cb3.getSelectedItem()=="Acres"){
                   String s1=s+c;
                double f=Double.parseDouble(s1); 
                double a=0.000022956841138659*f;
                l1.setText(a+"");
              }
               if(cb3.getSelectedItem()=="Hectares"){
                String s1=s+c;
                double f=Double.parseDouble(s1); 
                double h=0.000009290304*f;
                l1.setText(h+""); 
                
               }
                if(cb3.getSelectedItem()=="Square Centimeter"){
                  String s1=s+c;
                double f=Double.parseDouble(s1); 
                double sc=929.0304*f;
                l1.setText(sc+"");    
                
               }
                 if(cb3.getSelectedItem()=="Square Feet"){
                       String s1=s+c;
             double f=Double.parseDouble(s1); 
            l1.setText(f+"");
               
               }
                if(cb3.getSelectedItem()=="Square Inch"){
                String s1=s+c;
                double f=Double.parseDouble(s1); 
                double si=144*f;
                l1.setText(si+"");
               } 
                if(cb3.getSelectedItem()=="Square Kilometer"){
                String s1=s+c;
                double f=Double.parseDouble(s1); 
                double sk=0.00000009290304*f;
                l1.setText(sk+"");
               }
               if(cb3.getSelectedItem()=="Square Meter"){
                String s1=s+c;
                double f=Double.parseDouble(s1); 
                double sm=0.09290304*f;
                l1.setText(sm+"");
               }   
                
          }
             if(cb2.getSelectedItem()=="Square Inch"){
              if(cb3.getSelectedItem()=="Acres"){
                   String s1=s+c;
                double si=Double.parseDouble(s1); 
                double a=0.00000015942250790736*si;
                l1.setText(a+"");
              }
               if(cb3.getSelectedItem()=="Hectares"){
                String s1=s+c;
                double si=Double.parseDouble(s1); 
                double h=0.000000064516*si;
                l1.setText(h+""); 
                
               }
                if(cb3.getSelectedItem()=="Square Centimeter"){
                  String s1=s+c;
                double si=Double.parseDouble(s1); 
                double sc=6.4516*si;
                l1.setText(sc+"");    
                
               }
                 if(cb3.getSelectedItem()=="Square Feet"){
                     String s1=s+c;
                double si=Double.parseDouble(s1); 
                double f=0.0069444444444444*si;
                l1.setText(f+"");
                     
               
               }
                if(cb3.getSelectedItem()=="Square Inch"){
                  String s1=s+c;
             double si=Double.parseDouble(s1); 
            l1.setText(si+"");
               } 
                if(cb3.getSelectedItem()=="Square Kilometer"){
                String s1=s+c;
                double si=Double.parseDouble(s1); 
                double sk=0.00000000064516*si;
                l1.setText(sk+"");
               }
               if(cb3.getSelectedItem()=="Square Meter"){
                String s1=s+c;
                double si=Double.parseDouble(s1); 
                double sm=0.00064516*si;
                l1.setText(sm+"");
               }   
                
          }
              if(cb2.getSelectedItem()=="Square Kilometer"){
              if(cb3.getSelectedItem()=="Acres"){
                   String s1=s+c;
                double sk=Double.parseDouble(s1); 
                double a=247.10538146717*sk;
                l1.setText(a+"");
              }
               if(cb3.getSelectedItem()=="Hectares"){
                String s1=s+c;
                double sk=Double.parseDouble(s1); 
                double h=100*sk;
                l1.setText(h+""); 
                
               }
                if(cb3.getSelectedItem()=="Square Centimeter"){
                  String s1=s+c;
                double sk=Double.parseDouble(s1); 
                double sc=10000000000d*sk;
                l1.setText(sc+"");    
                
               }
                 if(cb3.getSelectedItem()=="Square Feet"){
                     String s1=s+c;
                double sk=Double.parseDouble(s1); 
                double f=10763910.41671*sk;
                l1.setText(f+"");
                     
               
               }
                if(cb3.getSelectedItem()=="Square Inch"){
                String s1=s+c;
                double sk=Double.parseDouble(s1); 
                double si=1550003100.0062*sk;
                l1.setText(si+"");
               } 
                if(cb3.getSelectedItem()=="Square Kilometer"){
                     String s1=s+c;
             double sk=Double.parseDouble(s1); 
            l1.setText(sk+"");
                
               }
               if(cb3.getSelectedItem()=="Square Meter"){
                String s1=s+c;
                double sk=Double.parseDouble(s1); 
                double sm=1000000*sk;
                l1.setText(sm+"");
               }   
                
          }
              if(cb2.getSelectedItem()=="Square Meter"){
              if(cb3.getSelectedItem()=="Acres"){
                   String s1=s+c;
                double sm=Double.parseDouble(s1); 
                double a=0.00024710538146717*sm;
                l1.setText(a+"");
              }
               if(cb3.getSelectedItem()=="Hectares"){
                String s1=s+c;
                double sm=Double.parseDouble(s1); 
                double h=0.0001*sm;
                l1.setText(h+""); 
                
               }
                if(cb3.getSelectedItem()=="Square Centimeter"){
                  String s1=s+c;
                double sm=Double.parseDouble(s1); 
                double sc=10000*sm;
                l1.setText(sc+"");    
                
               }
                 if(cb3.getSelectedItem()=="Square Feet"){
                     String s1=s+c;
                double sm=Double.parseDouble(s1); 
                double f=10.76391041671*sm;
                l1.setText(f+"");
                     
               
               }
                if(cb3.getSelectedItem()=="Square Inch"){
                String s1=s+c;
                double sm=Double.parseDouble(s1); 
                double si=1550.0031000062*sm;
                l1.setText(si+"");
               } 
                if(cb3.getSelectedItem()=="Square Kilometer"){
                   String s1=s+c;
                double sm=Double.parseDouble(s1); 
                double sk=0.0000010*sm;
                l1.setText(sk+"");  
                
               }
               if(cb3.getSelectedItem()=="Square Meter"){
                      String s1=s+c;
             double sm=Double.parseDouble(s1); 
            l1.setText(sm+"");
              
               }   
                
          }
      }
       if(cb1.getSelectedItem()=="Length"){
          if(cb2.getSelectedItem()=="Centimeter"){
              if(cb3.getSelectedItem()=="Centimeter"){
                    String s1=s+c;
             double cm=Double.parseDouble(s1); 
            l1.setText(cm+""); 
              }
               if(cb3.getSelectedItem()=="Feet"){
                String s1=s+c;
                double cm=Double.parseDouble(s1); 
                double ft= 0.0328084*cm;
                l1.setText(ft+"");
               }
                if(cb3.getSelectedItem()=="Inch"){
                String s1=s+c;
                double cm=Double.parseDouble(s1); 
                double i=0.393701*cm;
                l1.setText(i+"");
               }
                 if(cb3.getSelectedItem()=="Kilometer"){
                String s1=s+c;
                double cm=Double.parseDouble(s1); 
                double km=0.00001*cm;
                l1.setText(km+"");
               }
                if(cb3.getSelectedItem()=="Meter"){
                String s1=s+c;
                double cm=Double.parseDouble(s1); 
                double m=0.01*cm;
                l1.setText(m+"");
               } 
                if(cb3.getSelectedItem()=="Mile"){
                String s1=s+c;
                double cm=Double.parseDouble(s1); 
                double ml=0.000006213*cm;
                l1.setText(ml+"");
               }
               if(cb3.getSelectedItem()=="Yard"){
                String s1=s+c;
                double cm=Double.parseDouble(s1); 
                double y=0.0109361*cm;
                l1.setText(y+"");
               }   
                
          }
          if(cb2.getSelectedItem()=="Feet"){
              if(cb3.getSelectedItem()=="Centimeter"){
                String s1=s+c;
                double ft=Double.parseDouble(s1); 
                double cm= 30.48*ft;
                l1.setText(cm+"");  
              }
               if(cb3.getSelectedItem()=="Feet"){
                     String s1=s+c;
             double ft=Double.parseDouble(s1); 
            l1.setText(ft+"");
                
               }
                if(cb3.getSelectedItem()=="Inch"){
                String s1=s+c;
                double ft=Double.parseDouble(s1); 
                double i=12*ft;
                l1.setText(i+"");
               }
                 if(cb3.getSelectedItem()=="Kilometer"){
                String s1=s+c;
                double ft=Double.parseDouble(s1); 
                double km=0.0003048*ft;
                l1.setText(km+"");
               }
                if(cb3.getSelectedItem()=="Meter"){
                String s1=s+c;
                double ft=Double.parseDouble(s1); 
                double m=0.3048*ft;
                l1.setText(m+"");
               } 
                if(cb3.getSelectedItem()=="Mile"){
                String s1=s+c;
                double ft=Double.parseDouble(s1); 
                double ml=0.0001894*ft;
                l1.setText(ml+"");
               }
               if(cb3.getSelectedItem()=="Yard"){
                String s1=s+c;
                double ft=Double.parseDouble(s1); 
                double y=0.33333*ft;
                l1.setText(y+"");
               }   
                
          }
          if(cb2.getSelectedItem()=="Inch"){
              if(cb3.getSelectedItem()=="Centimeter"){
                String s1=s+c;
                double i=Double.parseDouble(s1); 
                double cm= 2.54*i;
                l1.setText(cm+"");  
              }
               if(cb3.getSelectedItem()=="Feet"){
                String s1=s+c;
                double i=Double.parseDouble(s1); 
                double ft=0.08333*i;
                l1.setText(ft+"");  
                
               }
                if(cb3.getSelectedItem()=="Inch"){
                       String s1=s+c;
             double i=Double.parseDouble(s1); 
            l1.setText(i+"");
                
               }
                 if(cb3.getSelectedItem()=="Kilometer"){
                String s1=s+c;
                double i=Double.parseDouble(s1); 
                double km=0.0000254*i;
                l1.setText(km+"");
               }
                if(cb3.getSelectedItem()=="Meter"){
                String s1=s+c;
                double i=Double.parseDouble(s1); 
                double m=0.0254*i;
                l1.setText(m+"");
               } 
                if(cb3.getSelectedItem()=="Mile"){
                String s1=s+c;
                double i=Double.parseDouble(s1); 
                double ml=0.000015782829*i;
                l1.setText(ml+"");
               }
               if(cb3.getSelectedItem()=="Yard"){
                String s1=s+c;
                double i=Double.parseDouble(s1); 
                double y=0.027777778*i;
                l1.setText(y+"");
               }   
                
          }
           if(cb2.getSelectedItem()=="Kilometer"){
              if(cb3.getSelectedItem()=="Centimeter"){
                String s1=s+c;
                double km=Double.parseDouble(s1); 
                double cm= 100000*km;
                l1.setText(cm+"");  
              }
               if(cb3.getSelectedItem()=="Feet"){
                String s1=s+c;
                double km=Double.parseDouble(s1); 
                double ft=3280.8398*km;
                l1.setText(ft+"");  
                
               }
                if(cb3.getSelectedItem()=="Inch"){
                   String s1=s+c;
                double km=Double.parseDouble(s1); 
                double i=39370.08*km;
                l1.setText(i+"");  
                
               }
                 if(cb3.getSelectedItem()=="Kilometer"){
                        String s1=s+c;
             double km=Double.parseDouble(s1); 
            l1.setText(km+"");
              
               }
                if(cb3.getSelectedItem()=="Meter"){
                String s1=s+c;
                double km=Double.parseDouble(s1); 
                double m=1000*km;
                l1.setText(m+"");
               } 
                if(cb3.getSelectedItem()=="Mile"){
                String s1=s+c;
                double km=Double.parseDouble(s1); 
                double ml=0.6213712*km;
                l1.setText(ml+"");
               }
               if(cb3.getSelectedItem()=="Yard"){
                String s1=s+c;
                double km=Double.parseDouble(s1); 
                double y=1093.6133*km;
                l1.setText(y+"");
               }   
                
          }
            if(cb2.getSelectedItem()=="Meter"){
              if(cb3.getSelectedItem()=="Centimeter"){
                String s1=s+c;
                double m=Double.parseDouble(s1); 
                double cm= 100*m;
                l1.setText(cm+"");  
              }
               if(cb3.getSelectedItem()=="Feet"){
                String s1=s+c;
                double m=Double.parseDouble(s1); 
                double ft=3.28084*m;
                l1.setText(ft+"");  
                
               }
                if(cb3.getSelectedItem()=="Inch"){
                   String s1=s+c;
                double m=Double.parseDouble(s1); 
                double i=39.37008*m;
                l1.setText(i+"");  
                
               }
                 if(cb3.getSelectedItem()=="Kilometer"){
                   String s1=s+c;
                double m=Double.parseDouble(s1); 
                double km=0.001*m;
                l1.setText(km+"");     
              
               }
                if(cb3.getSelectedItem()=="Meter"){
                       String s1=s+c;
             double m=Double.parseDouble(s1); 
            l1.setText(m+"");
               
               } 
                if(cb3.getSelectedItem()=="Mile"){
                String s1=s+c;
                double m=Double.parseDouble(s1); 
                double ml=0.0006213712*m;
                l1.setText(ml+"");
               }
               if(cb3.getSelectedItem()=="Yard"){
                String s1=s+c;
                double m=Double.parseDouble(s1); 
                double y=1.0936133*m;
                l1.setText(y+"");
               }   
                
          }
              if(cb2.getSelectedItem()=="Mile"){
              if(cb3.getSelectedItem()=="Centimeter"){
                String s1=s+c;
                double ml=Double.parseDouble(s1); 
                double cm= 160934.4*ml;
                l1.setText(cm+"");  
              }
               if(cb3.getSelectedItem()=="Feet"){
                String s1=s+c;
                double ml=Double.parseDouble(s1); 
                double ft=5280*ml;
                l1.setText(ft+"");  
                
               }
                if(cb3.getSelectedItem()=="Inch"){
                   String s1=s+c;
                double ml=Double.parseDouble(s1); 
                double i=63360*ml;
                l1.setText(i+"");  
                
               }
                 if(cb3.getSelectedItem()=="Kilometer"){
                   String s1=s+c;
                double ml=Double.parseDouble(s1); 
                double km=1.609344*ml;
                l1.setText(km+"");     
              
               }
                if(cb3.getSelectedItem()=="Meter"){
                  String s1=s+c;
                double ml=Double.parseDouble(s1); 
                double m=1609.344*ml;
                l1.setText(m+"");   
               
               } 
                if(cb3.getSelectedItem()=="Mile"){
                      String s1=s+c;
             double ml=Double.parseDouble(s1); 
            l1.setText(ml+"");
               
               }
               if(cb3.getSelectedItem()=="Yard"){
                String s1=s+c;
                double ml=Double.parseDouble(s1); 
                double y=1760*ml;
                l1.setText(y+"");
               }   
                
          }
            if(cb2.getSelectedItem()=="Yard"){
              if(cb3.getSelectedItem()=="Centimeter"){
                String s1=s+c;
                double y=Double.parseDouble(s1); 
                double cm=91.44*y;
                l1.setText(cm+"");  
              }
               if(cb3.getSelectedItem()=="Feet"){
                String s1=s+c;
                double y=Double.parseDouble(s1); 
                double ft=3*y;
                l1.setText(ft+"");  
                
               }
                if(cb3.getSelectedItem()=="Inch"){
                   String s1=s+c;
                double y=Double.parseDouble(s1); 
                double i=36*y;
                l1.setText(i+"");  
                
               }
                 if(cb3.getSelectedItem()=="Kilometer"){
                   String s1=s+c;
                double y=Double.parseDouble(s1); 
                double km=0.0009144*y;
                l1.setText(km+"");     
              
               }
                if(cb3.getSelectedItem()=="Meter"){
                  String s1=s+c;
                double y=Double.parseDouble(s1); 
                double m=0.9144*y;
                l1.setText(m+"");   
               
               } 
                if(cb3.getSelectedItem()=="Mile"){
                String s1=s+c;
                double y=Double.parseDouble(s1); 
                double ml=0.0005681818*y;
                l1.setText(ml+"");    
               
               }
               if(cb3.getSelectedItem()=="Yard"){
                     String s1=s+c;
             double y=Double.parseDouble(s1); 
            l1.setText(y+"");
                
               }   
                
          }   
       }
       if(cb1.getSelectedItem()=="Time"){
          if(cb2.getSelectedItem()=="Day"){
              if(cb3.getSelectedItem()=="Day"){
                   String s1=s+c;
             double d=Double.parseDouble(s1); 
            l1.setText(d+"");
              }
               if(cb3.getSelectedItem()=="Hours"){
                String s1=s+c;
                double d=Double.parseDouble(s1); 
                double hs=24*d;
                l1.setText(hs+"");
               }
                if(cb3.getSelectedItem()=="Microsecond"){
                String s1=s+c;
                double d=Double.parseDouble(s1); 
                double ms=0.000000000864*d;
                l1.setText(ms+"");
               }
                 if(cb3.getSelectedItem()=="Millisecond"){
                String s1=s+c;
                double d=Double.parseDouble(s1); 
                double mls=0.000000864*d;
                l1.setText(mls+"");
               }
                if(cb3.getSelectedItem()=="Minute"){
                String s1=s+c;
                double d=Double.parseDouble(s1); 
                double mn=1440*d;
                l1.setText(mn+"");
               } 
                if(cb3.getSelectedItem()=="Second"){
                String s1=s+c;
                double d=Double.parseDouble(s1); 
                double sc=86400*d;
                l1.setText(sc+"");
               }
               if(cb3.getSelectedItem()=="Week"){
                String s1=s+c;
                double d=Double.parseDouble(s1); 
                double w=0.14285715*d;
                l1.setText(w+"");
               }   
                
          }
          if(cb2.getSelectedItem()=="Hours"){
              if(cb3.getSelectedItem()=="Day"){
                String s1=s+c;
                double hs=Double.parseDouble(s1); 
                double d=0.041666668*hs;
                l1.setText(d+"");  
              }
               if(cb3.getSelectedItem()=="Hours"){
                      String s1=s+c;
             double hs=Double.parseDouble(s1); 
            l1.setText(hs+"");
               
               }
                if(cb3.getSelectedItem()=="Microsecond"){
                String s1=s+c;
                double hs=Double.parseDouble(s1); 
                double ms=0.0000000036*hs;
                l1.setText(ms+"");
               }
                 if(cb3.getSelectedItem()=="Millisecond"){
                String s1=s+c;
                double hs=Double.parseDouble(s1); 
                double mls=3600000*hs;
                l1.setText(mls+"");
               }
                if(cb3.getSelectedItem()=="Minute"){
                String s1=s+c;
                double hs=Double.parseDouble(s1); 
                double mn=60*hs;
                l1.setText(mn+"");
               } 
                if(cb3.getSelectedItem()=="Second"){
                String s1=s+c;
                double hs=Double.parseDouble(s1); 
                double sc=3600*hs;
                l1.setText(sc+"");
               }
               if(cb3.getSelectedItem()=="Week"){
                String s1=s+c;
                double hs=Double.parseDouble(s1); 
                double w=0.005952381*hs;
                l1.setText(w+"");
               }   
                
          }
           if(cb2.getSelectedItem()=="Microsecond"){
              if(cb3.getSelectedItem()=="Day"){
                String s1=s+c;
                double ms=Double.parseDouble(s1); 
                double d=0.000000000011574074*ms;
                l1.setText(d+"");  
              }
               if(cb3.getSelectedItem()=="Hours"){
                  String s1=s+c;
                double ms=Double.parseDouble(s1); 
                double hs=0.00000000027777777*ms;
                l1.setText(hs+"");   
               
               }
                if(cb3.getSelectedItem()=="Microsecond"){
                       String s1=s+c;
             double ms=Double.parseDouble(s1); 
            l1.setText(ms+"");
              
               }
                 if(cb3.getSelectedItem()=="Millisecond"){
                String s1=s+c;
                double ms=Double.parseDouble(s1); 
                double mls=0.001*ms;
                l1.setText(mls+"");
               }
                if(cb3.getSelectedItem()=="Minute"){
                String s1=s+c;
                double ms=Double.parseDouble(s1); 
                double mn=0.000000016666666*ms;
                l1.setText(mn+"");
               } 
                if(cb3.getSelectedItem()=="Second"){
                String s1=s+c;
                double ms=Double.parseDouble(s1); 
                double sc=0.000001*ms;
                l1.setText(sc+"");
               }
               if(cb3.getSelectedItem()=="Week"){
                String s1=s+c;
                double ms=Double.parseDouble(s1); 
                double w=0.0000000000016534391*ms;
                l1.setText(w+"");
               }   
                
          }
           if(cb2.getSelectedItem()=="Millisecond"){
              if(cb3.getSelectedItem()=="Day"){
                String s1=s+c;
                double mls=Double.parseDouble(s1); 
                double d=0.000000011574074*mls;
                l1.setText(d+"");  
              }
               if(cb3.getSelectedItem()=="Hours"){
                  String s1=s+c;
                double mls=Double.parseDouble(s1); 
                double hs=0.0000002777778*mls;
                l1.setText(hs+"");   
               
               }
                if(cb3.getSelectedItem()=="Microsecond"){
                 String s1=s+c;
                double mls=Double.parseDouble(s1); 
                double ms=1000*mls;
                l1.setText(ms+"");   
              
               }
                 if(cb3.getSelectedItem()=="Millisecond"){
                        String s1=s+c;
             double mls=Double.parseDouble(s1); 
            l1.setText(mls+"");
                
               }
                if(cb3.getSelectedItem()=="Minute"){
                String s1=s+c;
                double mls=Double.parseDouble(s1); 
                double mn=0.000016666667*mls;
                l1.setText(mn+"");
               } 
                if(cb3.getSelectedItem()=="Second"){
                String s1=s+c;
                double mls=Double.parseDouble(s1); 
                double sc=0.001*mls;
                l1.setText(sc+"");
               }
               if(cb3.getSelectedItem()=="Week"){
                String s1=s+c;
                double mls=Double.parseDouble(s1); 
                double w=0.0000000016534392*mls;
                l1.setText(w+"");
               }   
                
          }
           if(cb2.getSelectedItem()=="Minute"){
              if(cb3.getSelectedItem()=="Day"){
                String s1=s+c;
                double mn=Double.parseDouble(s1); 
                double d=0.00069444446*mn;
                l1.setText(d+"");  
              }
               if(cb3.getSelectedItem()=="Hours"){
                  String s1=s+c;
                double mn=Double.parseDouble(s1); 
                double hs=0.016666668*mn;
                l1.setText(hs+"");   
               
               }
                if(cb3.getSelectedItem()=="Microsecond"){
                 String s1=s+c;
                double mn=Double.parseDouble(s1); 
                double ms=0.0000006*mn;
                l1.setText(ms+"");   
              
               }
                 if(cb3.getSelectedItem()=="Millisecond"){
                 String s1=s+c;
                double mn=Double.parseDouble(s1); 
                double mls=60000*mn;
                l1.setText(mls+"");     
                
               }
                if(cb3.getSelectedItem()=="Minute"){
                      String s1=s+c;
             double mn=Double.parseDouble(s1); 
            l1.setText(mn+"");
                
               } 
                if(cb3.getSelectedItem()=="Second"){
                String s1=s+c;
                double mn=Double.parseDouble(s1); 
                double sc=60*mn;
                l1.setText(sc+"");
               }
               if(cb3.getSelectedItem()=="Week"){
                String s1=s+c;
                double mn=Double.parseDouble(s1); 
                double w=0.00009920635*mn;
                l1.setText(w+"");
               }   
                
          }
           if(cb2.getSelectedItem()=="Second"){
              if(cb3.getSelectedItem()=="Day"){
                String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double d=0.000011574074*sc;
                l1.setText(d+"");  
              }
               if(cb3.getSelectedItem()=="Hours"){
                  String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double hs=0.00027777778*sc;
                l1.setText(hs+"");   
               
               }
                if(cb3.getSelectedItem()=="Microsecond"){
                 String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double ms=1000000*sc;
                l1.setText(ms+"");   
              
               }
                 if(cb3.getSelectedItem()=="Millisecond"){
                 String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double mls=1000*sc;
                l1.setText(mls+"");     
                
               }
                if(cb3.getSelectedItem()=="Minute"){
                 String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double mn=0.016666668*sc;
                l1.setText(mn+"");   
                
               } 
                if(cb3.getSelectedItem()=="Second"){
                     String s1=s+c;
             double sc=Double.parseDouble(s1); 
            l1.setText(sc+"");
                
               }
               if(cb3.getSelectedItem()=="Week"){
                String s1=s+c;
                double sc=Double.parseDouble(s1); 
                double w=0.0000016534392*sc;
                l1.setText(w+"");
               }   
                
          }
            if(cb2.getSelectedItem()=="Week"){
              if(cb3.getSelectedItem()=="Day"){
                String s1=s+c;
                double w=Double.parseDouble(s1); 
                double d=7*w;
                l1.setText(d+"");  
              }
               if(cb3.getSelectedItem()=="Hours"){
                  String s1=s+c;
                double w=Double.parseDouble(s1); 
                double hs=168*w;
                l1.setText(hs+"");   
               
               }
                if(cb3.getSelectedItem()=="Microsecond"){
                 String s1=s+c;
                double w=Double.parseDouble(s1); 
                double ms=0.000000000060480002*w;
                l1.setText(ms+"");   
              
               }
                 if(cb3.getSelectedItem()=="Millisecond"){
                 String s1=s+c;
                double w=Double.parseDouble(s1); 
                double mls=0.00000006048*w;
                l1.setText(mls+"");     
                
               }
                if(cb3.getSelectedItem()=="Minute"){
                 String s1=s+c;
                double w=Double.parseDouble(s1); 
                double mn=10080*w;
                l1.setText(mn+"");   
                
               } 
                if(cb3.getSelectedItem()=="Second"){
                    
                 String s1=s+c;
                double w=Double.parseDouble(s1); 
                double sc=604800*w;
                l1.setText(sc+"");
               }
               if(cb3.getSelectedItem()=="Week"){
                    String s1=s+c;
             double w=Double.parseDouble(s1); 
            l1.setText(w+"");
               
               }   
                
          }
       }
      
           
       
      
  }
      else{
          evt.consume();
      }}
   catch(Exception ee){}
      
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        l1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        cb3 = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox();
        b1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        cb2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNIT CONVERTER");
        setResizable(false);

        l1.setBackground(new java.awt.Color(255, 255, 255));
        l1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Unit Converter");

        cb3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cb3.setBorder(null);
        cb3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb3ItemStateChanged(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Main Menu");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Select the type of unit you want to convert");

        cb1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Select Unit---", "Angle", "Area", "Length", "Time" }));
        cb1.setBorder(null);
        cb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb1ItemStateChanged(evt);
            }
        });

        b1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1.setText("OK");
        b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("From");

        t1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });

        cb2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cb2.setBorder(null);
        cb2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb2ItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("To");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(470, 470, 470)
                            .addComponent(jLabel4))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(141, 141, 141)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(48, 48, 48)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );
        jDesktopPane1.setLayer(l1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cb3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cb1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cb2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
       new Frame2().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
     
        if(cb1.getSelectedItem()=="---Select Unit---"){
          JOptionPane.showMessageDialog(this,"Please Select The Unit For Conversion");
      }
       if(cb1.getSelectedItem()=="Angle"){
           if(z==0){
         t1.setEnabled(true);
         cb2.setEnabled(true);
         cb3.setEnabled(true);
         cb2.addItem("---Select---");cb2.addItem("Degree");cb2.addItem("Gradian");cb2.addItem("Radian"); 
         cb3.addItem("---Select---");cb3.addItem("Degree");cb3.addItem("Gradian");cb3.addItem("Radian");
       z=z+1;
       } }
        if(cb1.getSelectedItem()=="Area"){
           if(z==0){
         t1.setEnabled(true);
         cb2.setEnabled(true);
         cb3.setEnabled(true);
         cb2.addItem("---Select---");cb2.addItem("Acres");cb2.addItem("Hectares");cb2.addItem("Square Centimeter");cb2.addItem("Square Feet");cb2.addItem("Square Inch");cb2.addItem("Square Kilometer");cb2.addItem("Square Meter");
          cb3.addItem("---Select---");cb3.addItem("Acres");cb3.addItem("Hectares");cb3.addItem("Square Centimeter");cb3.addItem("Square Feet");cb3.addItem("Square Inch");cb3.addItem("Square Kilometer");cb3.addItem("Square Meter");
       z=z+1;
       } }
          if(cb1.getSelectedItem()=="Length"){
           if(z==0){
         t1.setEnabled(true);
         cb2.setEnabled(true);
         cb3.setEnabled(true);
         cb2.addItem("---Select---");cb2.addItem("Centimeter");cb2.addItem("Feet");cb2.addItem("Inch");cb2.addItem("Kilometer");cb2.addItem("Meter");cb2.addItem("Mile");cb2.addItem("Yard");
          cb3.addItem("---Select---");cb3.addItem("Centimeter");cb3.addItem("Feet");cb3.addItem("Inch");cb3.addItem("Kilometer");cb3.addItem("Meter");cb3.addItem("Mile");cb3.addItem("Yard");
       z=z+1;
       } }
       if(cb1.getSelectedItem()=="Time"){
           if(z==0){
         t1.setEnabled(true);
         cb2.setEnabled(true);
         cb3.setEnabled(true);
         cb2.addItem("---Select---");cb2.addItem("Day");cb2.addItem("Hours");cb2.addItem("Microsecond");cb2.addItem("Millisecond");cb2.addItem("Minute");cb2.addItem("Second");cb2.addItem("Week");
         cb3.addItem("---Select---");cb3.addItem("Day");cb3.addItem("Hours");cb3.addItem("Microsecond");cb3.addItem("Millisecond");cb3.addItem("Minute");cb3.addItem("Second");cb3.addItem("Week");
       z=z+1;
       } }
      
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void cb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb1ItemStateChanged
      String s=(String)(cb1.getSelectedItem());
      if(s=="---Select Unit---"){
          cb2.removeAllItems();
          cb3.removeAllItems();
          t1.setText("");
          l1.setText("");
         t1.setEnabled(false);
         cb2.setEnabled(false);
         cb3.setEnabled(false);
         z=0;
      }
      else{
         cb2.removeAllItems();
          cb3.removeAllItems(); 
             t1.setText("");
          l1.setText("");
           t1.setEnabled(false);
         cb2.setEnabled(false);
         cb3.setEnabled(false);
         z=0;
      }
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ItemStateChanged

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
       f1(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_t1KeyTyped

    private void cb2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb2ItemStateChanged
       t1.setText("");
       l1.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ItemStateChanged

    private void cb3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb3ItemStateChanged
        t1.setText("");
       l1.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_cb3ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JComboBox cb1;
    private javax.swing.JComboBox cb2;
    private javax.swing.JComboBox cb3;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label l1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
