/*

    1 > A FRAME I WHICH WE HAVE TWO BUTTON START QUIZ END APP
    2 > A NEW FRAME, A LABEL FOR QUESTION, 4 RADIOBUTTON FOR OPTION, 3 BUTTON SAVE NEXT PREVIOUS

    CREATE A FRAME 2 IN DIFFERENT FUNCTION AND ADD CONTENT IN DIFFERENT
    
*/

package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

class Test implements ActionListener{
    
    JFrame frame1,frame2,frame3;
    ImageIcon Background;
    JLabel Img,question,congo,score;
    Image img;
    JButton start,exit,save,previous,next,exit2,submit;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup group;
    
    String[][] Question = new String[5][5];
    String[] Answer = new String[5];
    String[] inputAnswer = {"","","","",""}; 
    String actionCommand = "";
    int choice;
    int mark = 0;
    
    int QuestionNo = 0;
    
    
    Test()
    {
        /////// DECLARATION OF VARIABLE ////////////////////////////////////////
        
        Question[0][0] = "Who invented Java language?";
        Question[0][1] = "Dennis Ritchie";
        Question[0][2] = "James Gosling";
        Question[0][3] = "Larry Page";
        Question[0][4] = "Serge Page";

        Question[1][0] = "What is the file name extension of a Java source program?";
        Question[1][1] = ".j";
        Question[1][2] = ".ja";
        Question[1][3] = ".java";
        Question[1][4] = ".jax";

        Question[2][0] = "What is the output of Compilation of Java Program?";
        Question[2][1] = ".class file";
        Question[2][2] = ".cla file";
        Question[2][3] = ".jc file";
        Question[2][4] = ".javax file";

        Question[3][0] = "What does JVM stands for?";
        Question[3][1] = "Java Variable Machine";
        Question[3][2] = "Java Virtual Machine";
        Question[3][3] = "Java Virtual Mechanism";
        Question[3][4] = "None of the above";

        Question[4][0] = "Every statement in Java language should end with a?";
        Question[4][1] = "Dot or Period";
        Question[4][2] = "Comma";
        Question[4][3] = "Semicolon";
        Question[4][4] = "Colon";

        Answer[0] = "James Gosling";
        Answer[1] = ".java";
        Answer[2] = ".class file";
        Answer[3] = "Java Virtual Machine";
        Answer[4] = "Semicolon";
        
        ////////////////////////////////////////////////////////////////////////
        
        frame1 = new JFrame();
               
        Background = new ImageIcon("Background.jpg");
        img = Background.getImage().getScaledInstance(800,500,Image.SCALE_SMOOTH);
        Background = new ImageIcon(img);        
        
        Img = new JLabel(Background);
        Img.setBounds(0,0,800,500);
        
        start = new JButton("START");
        start.setBounds(250,400,100,50);
        start.setFocusable(false);
        start.setForeground(Color.WHITE);
        start.setBackground(Color.BLACK);
        start.addActionListener(this);             
        
        exit = new JButton("EXIT");
        exit.setBounds(450,400,100,50);
        exit.setFocusable(false);
        exit.setForeground(Color.WHITE);
        exit.setBackground(Color.BLACK); 
        exit.addActionListener(this);          
        
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(815,535);
        frame1.setLayout(null);
        frame1.setTitle("QUIZ APP"); 
        frame1.setLocationRelativeTo(null);
        
        frame1.add(start);
        frame1.add(exit);
        frame1.add(Img);
        
        frame1.setVisible(true);
    }
    
    public void frame2()
    {        
        frame2 = new JFrame();
        
        System.out.println("IT CALL");
        
        question = new JLabel();
        question.setBounds(50,25,800,50);
        question.setFont(new Font("DEFAULT",Font.PLAIN,20));
        
        opt1 = new JRadioButton("OPT1");
        opt1.setBounds(50,150,300,100);
        opt1.setFont(new Font("DEFAULT",Font.PLAIN,15)); 
        opt1.setBackground(Color.WHITE);
        opt1.setFocusPainted(false);
        opt1.setActionCommand(Question[QuestionNo][1]);
        opt2 = new JRadioButton("OPT2");
        opt2.setBounds(50,220,300,100);
        opt2.setFont(new Font("DEFAULT",Font.PLAIN,15)); 
        opt2.setBackground(Color.WHITE);
        opt2.setFocusPainted(false);
        opt2.setActionCommand(Question[QuestionNo][2]);
        opt3 = new JRadioButton("OPT3");
        opt3.setBounds(50,300,300,100);
        opt3.setFont(new Font("DEFAULT",Font.PLAIN,15)); 
        opt3.setBackground(Color.WHITE);
        opt3.setFocusPainted(false);
        opt3.setActionCommand(Question[QuestionNo][3]);
        opt4 = new JRadioButton("OPT4");
        opt4.setBounds(50,380,300,100);
        opt4.setFont(new Font("DEFAULT",Font.PLAIN,15)); 
        opt4.setBackground(Color.WHITE);
        opt4.setFocusPainted(false);
        opt4.setActionCommand(Question[QuestionNo][4]);
        
        group = new ButtonGroup();
        
        group.add(opt1);
        group.add(opt2);
        group.add(opt3);
        group.add(opt4);        
        
        previous = new JButton("PREVIOUS");
        previous.setBounds(650,160,100,50);
        previous.setForeground(Color.WHITE); 
        previous.setBackground(Color.BLUE);
        previous.setFocusable(false);
        previous.addActionListener(this); 
        save = new JButton("SAVE"); 
        save.setBounds(650,240,100,50);
        save.setForeground(Color.WHITE); 
        save.setBackground(Color.BLUE);
        save.setFocusable(false);
        save.addActionListener(this); 
        next = new JButton("NEXT");   
        next.setBounds(650,320,100,50);
        next.setForeground(Color.WHITE); 
        next.setBackground(Color.BLUE);
        next.setFocusable(false);
        next.addActionListener(this); 
        exit2 = new JButton("EXIT");
        exit2.setBounds(650,400,100,50);
        exit2.setForeground(Color.WHITE); 
        exit2.setBackground(Color.BLUE);   
        exit2.setFocusable(false);
        exit2.addActionListener(this); 
        
        submit = new JButton("SUBMIT");
        submit.setBounds(350,500,100,50);
        submit.setFocusable(false);
        submit.setForeground(Color.WHITE);
        submit.setBackground(Color.BLACK); 
        submit.addActionListener(this); 
        submit.setVisible(false); 
        
        ////////////////////////////////////////////////////////////////////////
        
        question.setText((QuestionNo + 1) + ". " + Question[QuestionNo][0]);
        opt1.setText("1. " + Question[QuestionNo][1]);
        opt2.setText("2. " + Question[QuestionNo][2]);
        opt3.setText("3. " + Question[QuestionNo][3]);
        opt4.setText("4. " + Question[QuestionNo][4]);
        
        ////////////////////////////////////////////////////////////////////////  
                
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(800,600); 
        frame2.setLayout(null); 
        frame2.setTitle("QUIZ APP");
        frame2.setLocationRelativeTo(null);  
        frame2.getContentPane().setBackground(Color.WHITE);                 

        frame2.add(question);  
        frame2.add(opt1);
        frame2.add(opt2);
        frame2.add(opt3);
        frame2.add(opt4);
        frame2.add(previous);
        frame2.add(save);
        frame2.add(next);
        frame2.add(exit2);
        frame2.add(submit);
        
        frame2.setVisible(true);
        
        Check();
        
    }
    
    public void SetText()
    {
        question.setText((QuestionNo + 1) + ". " + Question[QuestionNo][0]);
        opt1.setText("1. " + Question[QuestionNo][1]);
        opt2.setText("2. " + Question[QuestionNo][2]);
        opt3.setText("3. " + Question[QuestionNo][3]);
        opt4.setText("4. " + Question[QuestionNo][4]);

    }
    
    public void Check()            
    {
        ////////////////////// CODING //////////////////////////////////////////
        
        if(QuestionNo == 0)
        {
            previous.setEnabled(false);
            next.setEnabled(true);
        }
        else if(QuestionNo == 4)
        {
            previous.setEnabled(true);
            next.setEnabled(false); 
            submit.setVisible(true); 
        }
        else if(QuestionNo > 0 && QuestionNo < 4)
        {
            previous.setEnabled(true);
            next.setEnabled(true);
            submit.setVisible(false); 
        }
        
        ////////////////////////////////////////////////////////////////////////
    }
    
    public void saves()
    {
        if(group.getSelection() == null)
        {
            System.out.println("NULL");
        }
        else
        {           
System.out.println(group.getSelection().getActionCommand());
        opt1.setActionCommand(Question[QuestionNo][1]);
        opt2.setActionCommand(Question[QuestionNo][2]);
        opt3.setActionCommand(Question[QuestionNo][3]);
        opt4.setActionCommand(Question[QuestionNo][4]);
        
        inputAnswer[QuestionNo] = group.getSelection().getActionCommand();
        }
    }
    
    public void counting_marks()
    {
        for(int i = 0 ; i <= 4 ; i++)
        {
            if(inputAnswer[i] == Answer[i])
            {
                mark+=10;
            }
            else
            {
                mark+=0;
            }
        }
        
        System.out.println(mark);
    }
    
    public void frame3()
    {
        frame3 = new JFrame();
        
        congo = new JLabel("!!! CONGRATULATION !!!");
        score = new JLabel("YOU HAVE SCORED " + mark + " / 50");
        
        congo.setBounds(50,50,400,50);
        congo.setFont(new Font("DEFAULT",Font.PLAIN,20));
        
        score.setBounds(50,150,400,50);
        score.setFont(new Font("DEFAULT",Font.PLAIN,20));
        
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame3.setSize(600,600);
        frame3.setTitle("QUIZ APP");
        frame3.setLayout(null);
        frame3.setLocationRelativeTo(null); 
        
        frame3.add(congo);
        frame3.add(score);
        
        frame3.setVisible(true); 
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource() == start)
        {
            frame1.dispose();
            frame2();
        }
        else if(e.getSource() == exit)
        {
            frame1.dispose();
        }
        else if(e.getSource() == previous)
        {
            System.out.println("previous");  
            
            if(QuestionNo > -1)
            {
                System.out.println(" No : " + QuestionNo);
                QuestionNo--;          
                SetText(); 
            }
            else
            {
                System.out.println("EXTENDED");
            }
            
            Check();
            
            group.clearSelection();
            
        }
        else if(e.getSource() == save)
        {
            System.out.println("save");
            
            saves();       

            SetText();
            
        }
        else if(e.getSource() == next)
        {
            
            System.out.println("next");       
            
            if(QuestionNo < 4)
            {
                System.out.println(" No : " + QuestionNo);
                QuestionNo++;          
                SetText(); 
            }
            else
            {
                System.out.println("EXTENDED");
            }
            
            Check();
            
            group.clearSelection();

        }
        else if(e.getSource() == exit2)
        {
            System.out.println("exit");
            frame2.dispose();
        }
        else if(e.getSource() == submit)
        {
            for(int i = 0 ; i <= 4 ; i++)
            {
                System.out.println((i + 1) + " : " + inputAnswer[i]);
            }
            
            choice = JOptionPane.showConfirmDialog(null,"ARE YOU SURE TO SUBMIT QUIZ","JOPTION",JOptionPane.YES_NO_OPTION);
            
            switch(choice)
            {
                case 0:
                    System.out.println("YES");
                    frame2.dispose();
                    counting_marks();
                    frame3();
                break;                    
                case 1:
                    System.out.println("NO");
                break;
                    
            }
        }
        
    }
}

public class Quiz {
    public static void main(String[] args) {
        
        Test t = new Test();
       
    }    
}
