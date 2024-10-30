import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;


import java.awt.*;
import java.awt.event.*;
 
public class NacleGUI extends JFrame{
    public static final Color White = new Color(255,255,255);
    protected static String targetWord;
    protected static WordChecker checker;
    protected static TimeKeeper timerSet = new TimeKeeper(540);


    protected static JLabel status;
    protected static JLabel message;

    protected static JPanel submission = new JPanel();
    protected static JButton submit1 = new JButton  ("Submit");
    protected static JButton submit2 = new JButton  ("Submit");
    protected static JButton submit3 = new JButton  ("Submit");
    protected static JButton submit4 = new JButton  ("Submit");

    protected static JTextField row1_1_1;
    protected static JTextField row1_1_2;
    protected static JTextField row1_1_3;
    protected static JTextField row1_2_1;
    protected static JTextField row1_2_2;
    protected static JTextField row1_2_3;
    protected static JTextField row2_1_1;
    protected static JTextField row2_1_2;
    protected static JTextField row2_1_3;
    protected static JTextField row2_2_1;
    protected static JTextField row2_2_2;
    protected static JTextField row2_2_3;
    protected static JTextField row3_1_1;
    protected static JTextField row3_1_2;
    protected static JTextField row3_1_3;
    protected static JTextField row3_2_1;
    protected static JTextField row3_2_2;
    protected static JTextField row3_2_3;
    protected static JTextField row4_1_1;
    protected static JTextField row4_1_2;
    protected static JTextField row4_1_3;
    protected static JTextField row4_2_1;
    protected static JTextField row4_2_2;
    protected static JTextField row4_2_3;


    public NacleGUI() {
        super();
        Font f2 = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        Font f3 = new Font(Font.SANS_SERIF, Font.BOLD, 10);
        
        checker = new WordChecker();
        targetWord = checker.choseAWord();
        //System.out.println(targetWord);
        
        JFrame frame = new JFrame();

        frame.setTitle("Nacle");
        frame.setSize(229, 312);
        frame.setResizable(false);
        frame.setLocation(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel row1_1 = new JPanel();
        row1_1.setLayout(new BorderLayout());
        row1_1_1 = new JTextField("", 1);
        row1_1_1.setFont(f2);
        row1_1_1.setHorizontalAlignment(JTextField.CENTER);
        row1_1_2 = new JTextField("", 1);
        row1_1_2.setFont(f2);
        row1_1_2.setHorizontalAlignment(JTextField.CENTER);
        row1_1_3 = new JTextField("", 1);
        row1_1_3.setFont(f2);
        row1_1_3.setHorizontalAlignment(JTextField.CENTER);
        row1_1.add(row1_1_1, BorderLayout.WEST);
        row1_1.add(row1_1_2, BorderLayout.CENTER);
        row1_1.add(row1_1_3, BorderLayout.EAST);

        JPanel row1_2 = new JPanel();
        row1_2.setLayout(new BorderLayout());
        row1_2_1 = new JTextField("", 1);
        row1_2_1.setFont(f2);
        row1_2_1.setHorizontalAlignment(JTextField.CENTER);
        row1_2_2 = new JTextField("", 1);
        row1_2_2.setFont(f2);
        row1_2_2.setHorizontalAlignment(JTextField.CENTER);
        row1_2_3 = new JTextField("", 1);
        row1_2_3.setFont(f2);
        row1_2_3.setHorizontalAlignment(JTextField.CENTER);
        row1_2.add(row1_2_1, BorderLayout.WEST);
        row1_2.add(row1_2_2, BorderLayout.CENTER);
        row1_2.add(row1_2_3, BorderLayout.EAST);

        JPanel row1 = new JPanel();
        row1.setLayout(new BorderLayout());
        row1.add(row1_1, BorderLayout.WEST);
        row1.add(row1_2, BorderLayout.EAST);

        JPanel row2_1 = new JPanel();
        row2_1.setLayout(new BorderLayout());
        row2_1_1 = new JTextField("", 1);
        row2_1_1.setFont(f2);
        row2_1_1.setHorizontalAlignment(JTextField.CENTER);
        row2_1_2 = new JTextField("", 1);
        row2_1_2.setFont(f2);
        row2_1_2.setHorizontalAlignment(JTextField.CENTER);
        row2_1_3 = new JTextField("", 1);
        row2_1_3.setFont(f2);
        row2_1_3.setHorizontalAlignment(JTextField.CENTER);
        row2_1.add(row2_1_1, BorderLayout.WEST);
        row2_1.add(row2_1_2, BorderLayout.CENTER);
        row2_1.add(row2_1_3, BorderLayout.EAST);

        JPanel row2_2 = new JPanel();
        row2_2.setLayout(new BorderLayout());
        row2_2_1 = new JTextField("", 1);
        row2_2_1.setFont(f2);
        row2_2_1.setHorizontalAlignment(JTextField.CENTER);
        row2_2_2 = new JTextField("", 1);
        row2_2_2.setFont(f2);
        row2_2_2.setHorizontalAlignment(JTextField.CENTER);
        row2_2_3 = new JTextField("", 1);
        row2_2_3.setFont(f2);
        row2_2_3.setHorizontalAlignment(JTextField.CENTER);
        row2_2.add(row2_2_1, BorderLayout.WEST);
        row2_2.add(row2_2_2, BorderLayout.CENTER);
        row2_2.add(row2_2_3, BorderLayout.EAST);

        JPanel row2 = new JPanel();
        row2.setLayout(new BorderLayout());
        row2.add(row2_1, BorderLayout.WEST);
        row2.add(row2_2, BorderLayout.EAST);

        JPanel row3_1 = new JPanel();
        row3_1.setLayout(new BorderLayout());
        row3_1_1 = new JTextField("", 1);
        row3_1_1.setFont(f2);
        row3_1_1.setHorizontalAlignment(JTextField.CENTER);
        row3_1_2 = new JTextField("", 1);
        row3_1_2.setFont(f2);
        row3_1_2.setHorizontalAlignment(JTextField.CENTER);
        row3_1_3 = new JTextField("", 1);
        row3_1_3.setFont(f2);
        row3_1_3.setHorizontalAlignment(JTextField.CENTER);
        row3_1.add(row3_1_1, BorderLayout.WEST);
        row3_1.add(row3_1_2, BorderLayout.CENTER);
        row3_1.add(row3_1_3, BorderLayout.EAST);

        JPanel row3_2 = new JPanel();
        row3_2.setLayout(new BorderLayout());
        row3_2_1 = new JTextField("", 1);
        row3_2_1.setFont(f2);
        row3_2_1.setHorizontalAlignment(JTextField.CENTER);
        row3_2_2 = new JTextField("", 1);
        row3_2_2.setFont(f2);
        row3_2_2.setHorizontalAlignment(JTextField.CENTER);
        row3_2_3 = new JTextField("", 1);
        row3_2_3.setFont(f2);
        row3_2_3.setHorizontalAlignment(JTextField.CENTER);
        row3_2.add(row3_2_1, BorderLayout.WEST);
        row3_2.add(row3_2_2, BorderLayout.CENTER);
        row3_2.add(row3_2_3, BorderLayout.EAST);

        JPanel row3 = new JPanel();
        row3.setLayout(new BorderLayout());
        row3.add(row3_1, BorderLayout.WEST);
        row3.add(row3_2, BorderLayout.EAST);

        JPanel row4_1 = new JPanel();
        row4_1.setLayout(new BorderLayout());
        row4_1_1 = new JTextField("", 1);
        row4_1_1.setFont(f2);
        row4_1_1.setHorizontalAlignment(JTextField.CENTER);
        row4_1_2 = new JTextField("", 1);
        row4_1_2.setFont(f2);
        row4_1_2.setHorizontalAlignment(JTextField.CENTER);
        row4_1_3 = new JTextField("", 1);
        row4_1_3.setFont(f2);
        row4_1_3.setHorizontalAlignment(JTextField.CENTER);
        row4_1.add(row4_1_1, BorderLayout.WEST);
        row4_1.add(row4_1_2, BorderLayout.CENTER);
        row4_1.add(row4_1_3, BorderLayout.EAST);

        JPanel row4_2 = new JPanel();
        row4_2.setLayout(new BorderLayout());
        row4_2_1 = new JTextField("", 1);
        row4_2_1.setFont(f2);
        row4_2_1.setHorizontalAlignment(JTextField.CENTER);
        row4_2_2 = new JTextField("", 1);
        row4_2_2.setFont(f2);
        row4_2_2.setHorizontalAlignment(JTextField.CENTER);
        row4_2_3 = new JTextField("", 1);
        row4_2_3.setFont(f2);
        row4_2_3.setHorizontalAlignment(JTextField.CENTER);
        row4_2.add(row4_2_1, BorderLayout.WEST);
        row4_2.add(row4_2_2, BorderLayout.CENTER);
        row4_2.add(row4_2_3, BorderLayout.EAST);

        JPanel row4 = new JPanel();
        row4.setLayout(new BorderLayout());
        row4.add(row4_1, BorderLayout.WEST);
        row4.add(row4_2, BorderLayout.EAST);

        JPanel toprows = new JPanel();
        toprows.setLayout(new BorderLayout());
        toprows.add(row1, BorderLayout.NORTH);
        toprows.add(row2, BorderLayout.CENTER);

        JPanel bottomrows = new JPanel();
        bottomrows.setLayout(new BorderLayout());
        bottomrows.add(row3, BorderLayout.CENTER);
        bottomrows.add(row4, BorderLayout.SOUTH);

        JPanel textentry = new JPanel();
        textentry.setLayout(new BorderLayout ());
        textentry.add(toprows, BorderLayout.NORTH);
        textentry.add(bottomrows, BorderLayout.CENTER);

        JPanel time = new JPanel();
        time.setLayout(new BorderLayout ());
        status = new JLabel("Time Remaining:");
        status.setFont(f3);

        time.add(status, BorderLayout.WEST);

        submission.setLayout(new BorderLayout ());
        submission.add(submit1, BorderLayout.NORTH);

        submit1.setFont(f3);
        submit2.setFont(f3);
        submit3.setFont(f3);
        submit4.setFont(f3);

        JPanel instructions = new JPanel();
        instructions.setLayout (new BorderLayout ());
        JButton rules = new JButton ("Rules");
        rules.setFont(f3);
        instructions.add(rules, BorderLayout.CENTER);
        submission.add(instructions, BorderLayout.CENTER);
        
        JButton restart = new JButton ("Restart");
        restart.setFont(f3);
        submit1.setEnabled(false);
        

        JButton start = new JButton ("Start");
        start.setFont(f3);
        submission.add(start, BorderLayout.SOUTH);
        submit1.setEnabled(false);



        start.addActionListener ( (e) -> {
            timerSet.start();
            submission.remove(start);
            submission.add(restart, BorderLayout.SOUTH);

            row1SetEdit(true);

            submit1.setEnabled(true);
        });
         

        restart.addActionListener ( (e) -> {

            message.setText("The correct word was " + targetWord);

            targetWord = checker.choseAWord();

            row1SetEdit(true);
            row2SetEdit(false);
            row3SetEdit(false);
            row4SetEdit(false);

            row1_1_1.setText("");
            row1_1_1.setBackground(White);

            row1_1_2.setText("");
            row1_1_2.setBackground(White);

            row1_1_3.setText("");
            row1_1_3.setBackground(White);

            row1_2_1.setText("");
            row1_2_1.setBackground(White);

            row1_2_2.setText("");
            row1_2_2.setBackground(White);

            row1_2_3.setText("");
            row1_2_3.setBackground(White);
            
            row2_1_1.setText("");
            row2_1_1.setBackground(White);

            row2_1_2.setText("");
            row2_1_2.setBackground(White);

            row2_1_3.setText("");
            row2_1_3.setBackground(White);

            row2_2_1.setText("");
            row2_2_1.setBackground(White);

            row2_2_2.setText("");
            row2_2_2.setBackground(White);

            row2_2_3.setText("");
            row2_2_3.setBackground(White);
     
            row3_1_1.setText("");
            row3_1_1.setBackground(White);
            
            row3_1_2.setText("");
            row3_1_2.setBackground(White);
            
            row3_1_3.setText("");
            row3_1_3.setBackground(White);

            row3_2_1.setText("");
            row3_2_1.setBackground(White);

            row3_2_2.setText("");
            row3_2_2.setBackground(White);

            row3_2_3.setText("");
            row3_2_3.setBackground(White);
     
            row4_1_1.setText("");
            row4_1_1.setBackground(White);

            row4_1_2.setText("");
            row4_1_2.setBackground(White);

            row4_1_3.setText("");
            row4_1_3.setBackground(White);

            row4_2_1.setText("");
            row4_2_1.setBackground(White);

            row4_2_2.setText("");
            row4_2_2.setBackground(White);

            row4_2_3.setText("");
            row4_2_3.setBackground(White);

            timerSet.restart();

            submit1.setEnabled(true);

        });

        rules.addActionListener ( (e) -> {

        JFrame click = new JFrame();

        click.setTitle("Nacle Rules");
        click.setSize(600, 150);
        click.setResizable(false);
        click.setLocation(600, 400);



        JTextArea howtoplay = new JTextArea("How to Play: \nYour objective is to guess a six letter random word. \nMake sure to complete your guess before the timer runs out. \nReady to get back to your game? Close this window and click start! \nGood luck! \n - Nacle Team");
        Font f4 = new Font(Font.MONOSPACED, Font.PLAIN, 15);
        howtoplay.setFont(f4);

        howtoplay.setEditable(false);

        click.add(howtoplay, BorderLayout.CENTER);
        click.setVisible(true);

        });

        JPanel alert = new JPanel();
        alert.setLayout(new BorderLayout ());
        message = new JLabel ("Welcome to Nacle!");
        message.setHorizontalAlignment(JLabel.CENTER);
        message.setFont(f3);
        alert.add(message, BorderLayout.CENTER);

        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout ());
        bottom.add(time, BorderLayout.WEST);
        bottom.add(submission, BorderLayout.EAST);

        frame.add(textentry, BorderLayout.NORTH);
        frame.add(bottom, BorderLayout.CENTER);
        frame.add(alert, BorderLayout.SOUTH);


        // creating an array for each word, of type JTextField
       // JTextField[] firstGuess = new JTextField[5];
        JTextField[] firstGuess = {row1_1_1, row1_1_2, row1_1_3, row1_2_1, row1_2_2, row1_2_3};
        JTextField[] secondGuess = {row2_1_1, row2_1_2, row2_1_3, row2_2_1, row2_2_2, row2_2_3};
        JTextField[] thirdGuess = {row3_1_1, row3_1_2, row3_1_3, row3_2_1, row3_2_2, row3_2_3};
        JTextField[] fourthGuess = {row4_1_1, row4_1_2, row4_1_3, row4_2_1, row4_2_2, row4_2_3};

        row1SetEdit(false);
        row2SetEdit(false);
        row3SetEdit(false);
        row4SetEdit(false);


        frame.setVisible(true);


        //////////////////// ACTION LISTENERS BELOW ////////////////////////////////////////

        // KEYLISTENER: when the enter button is pressed on the LAST letter of the FIRST word
        row1_2_3.addKeyListener(new KeyAdapter() { // if enter key is pressed at the 6th letter of first word, submits attempt
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    // if word is in Validwordlist, check color coding
                   // need to get the user-inputted string equal to  in WordChecker so it can check 
                   // if the word is valid. if it is, use the colorCode 
                        String firstWord = row1_1_1.getText() + row1_1_2.getText() + row1_1_3.getText() + row1_2_1.getText() + row1_2_2.getText() + row1_2_3.getText();              
                        if (status.getText().equals("Time Remaining: 0")) {
                           return; 
                        }
                        if (checker.validWordCheck(firstWord)) {
                            row1SetEdit(false);

                            row2SetEdit(true);

                            submission.remove(submit1);
                            submission.add(submit2, BorderLayout.NORTH); 
                           

                            // for loop, if its 0/1/2, change the color
                            String numbered = WordChecker.colorCode(firstWord, targetWord); // what Cathal returns to me 
                            ColorThread coloring = new ColorThread(numbered, firstGuess);
                            coloring.start();

                            if (numbered.equals("222222")) {
                                correct();
                            }
                            else {
                                message.setForeground(Color.BLACK);
                                message.setText("Come on, guess harder!");
                            }

                        } else if (!checker.validWordCheck(firstWord)) {
                            message.setForeground(Color.RED);
                            message.setText("Invalid word, try again!");
                        
                   }

                }
            }
        });

        submit1.addActionListener((e) -> {
            String firstWord = row1_1_1.getText() + row1_1_2.getText() + row1_1_3.getText() + row1_2_1.getText() + row1_2_2.getText() + row1_2_3.getText();
                
            if (checker.validWordCheck(firstWord)) {
                row1SetEdit(false);

                row2SetEdit(true);


                submission.remove(submit1);
                submission.add(submit2, BorderLayout.NORTH);               

                // for loop, if its 0/1/2, change the color
                String numbered = WordChecker.colorCode(firstWord, targetWord); // what Cathal returns to me 
                ColorThread coloring = new ColorThread(numbered, firstGuess);
                coloring.start();

                if (numbered.equals("222222")) {
                    correct();
                }
                else {
                    message.setForeground(Color.BLACK);
                    message.setText("Come on, guess harder!");
                }

            } else if (!checker.validWordCheck(firstWord)) {
                message.setForeground(Color.RED);
                message.setText("Invalid word, try again!");
            // message in message box stays try again, and clears the input boxes
            }
            

        });

        // when the enter button is pressed on the second guess:
        row2_2_3.addKeyListener(new KeyAdapter() { // if enter key is pressed at the 6th letter of first word, submits attempt
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_ENTER){    
                    String secondWord = row2_1_1.getText() + row2_1_2.getText() +row2_1_3.getText() +row2_2_1.getText() +row2_2_2.getText() +row2_2_3.getText();            
                    WordChecker checker = new WordChecker(); // create an instance of WordChecker class
                    if (status.getText().equals("Time Remaining: 0")) {
                        return; 
                     }
                    if (checker.validWordCheck(secondWord)) {
                        row2SetEdit(false);

                        row3SetEdit(true);

                        submission.remove(submit2);
                        submission.add(submit3, BorderLayout.NORTH);      
                    

                        String numbered = WordChecker.colorCode(secondWord, targetWord); // what Cathal returns to me 
                        ColorThread coloring = new ColorThread(numbered, secondGuess);
                        coloring.start();

                        if (numbered.equals("222222")) {
                            correct();
                        }
                        else {
                            message.setForeground(Color.BLACK);
                            message.setText("Are you kidding me!");
                        }
                       
                    } else if (!checker.validWordCheck(secondWord)) {
                        message.setForeground(Color.RED);
                        message.setText("Invalid word, try again!");
                   }

                }
            }
        });

        submit2.addActionListener((e) -> {
            String secondWord = row2_1_1.getText() + row2_1_2.getText() +row2_1_3.getText() +row2_2_1.getText() +row2_2_2.getText() +row2_2_3.getText();
                
            if (checker.validWordCheck(secondWord)) {
                row2SetEdit(false);

                row3SetEdit(true);

                submission.remove(submit2);
                submission.add(submit3, BorderLayout.NORTH);
                

                String numbered = WordChecker.colorCode(secondWord, targetWord); // what Cathal returns to me 
                ColorThread coloring = new ColorThread(numbered, secondGuess);
                coloring.start();

                if (numbered.equals("222222")) {
                    correct();
                }
                else {
                    message.setForeground(Color.BLACK);
                    message.setText("Are you kidding me!");
                }

            // counter++;
            } else if (!checker.validWordCheck(secondWord)) {
                message.setForeground(Color.RED);
                message.setText("Invalid word, try again!");
            // message in message box stays try again, and clears the input boxes
            }
            

        });
        // when the enter button is pressed on the third guess:
        row3_2_3.addKeyListener(new KeyAdapter() { // if enter key is pressed at the 6th letter of first word, submits attempt
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    String thirdWord = row3_1_1.getText() +row3_1_2.getText() +row3_1_3.getText() +row3_2_1.getText() +row3_2_2.getText() +row3_2_3.getText();    
                    if (status.getText().equals("Time Remaining: 0")) {
                        return; 
                    }
                    if (checker.validWordCheck(thirdWord)) {
                        row3SetEdit(false);

                        row4SetEdit(true);

                        submission.remove(submit3);
                        submission.add(submit4, BorderLayout.NORTH); 

                        String numbered = WordChecker.colorCode(thirdWord, targetWord); // what Cathal returns to me 
                        ColorThread coloring = new ColorThread(numbered, thirdGuess);
                        coloring.start();

                        if (numbered.equals("222222")) {
                            correct();
                        }
                        else {
                            message.setForeground(Color.BLACK);
                            message.setText("You only live one life, make it count!");
                        }

                    } else if (!checker.validWordCheck(thirdWord)) {
                        message.setForeground(Color.RED);
                        message.setText("Invalid word, try again!");
                   }

                }
            }
        });

        submit3.addActionListener((e) -> {
            String thirdWord = row3_1_1.getText() +row3_1_2.getText() +row3_1_3.getText() +row3_2_1.getText() +row3_2_2.getText() +row3_2_3.getText();
            
            if (checker.validWordCheck(thirdWord)) {
                row3SetEdit(false);

                row4SetEdit(true);

                submission.remove(submit3);
                submission.add(submit4, BorderLayout.NORTH);
                

                // for loop, if its 0/1/2, change the color
                String numbered = WordChecker.colorCode(thirdWord, targetWord); // what Cathal returns to me 
                ColorThread coloring = new ColorThread(numbered, thirdGuess);
                            coloring.start();

                if (numbered.equals("222222")) {
                    correct();
                }
                else {
                    message.setForeground(Color.BLACK);
                    message.setText("You only live one life, make it count!");
                }

            } else if (!checker.validWordCheck(thirdWord)) {
                message.setForeground(Color.RED);
                message.setText("Invalid word, try again!");
            }
            

        });

        // when the enter button is pressed on the fourth guess:    
        row4_2_3.addKeyListener(new KeyAdapter() { // if enter key is pressed at the 6th letter of first word, submits attempt
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_ENTER){  
                    String fourthWord = row4_1_1.getText() +row4_1_2.getText() +row4_1_3.getText() +row4_2_1.getText() +row4_2_2.getText() +row4_2_3.getText();              
                    if (status.getText().equals("Time Remaining: 0")) {
                        return; 
                     }
                    if (checker.validWordCheck(fourthWord)) {
                        row4SetEdit(false);   

                        submission.remove(submit4);
                        submission.add(submit1, BorderLayout.NORTH);
                        submit1.setEnabled(false);    

                        WordChecker.colorCode(fourthWord, targetWord);
                        String numbered = WordChecker.colorCode(fourthWord, targetWord); // what Cathal returns to me 
                        ColorThread coloring = new ColorThread(numbered, fourthGuess);
                        coloring.start();

                        if (numbered.equals("222222")) {
                            correct();
                        }
                        else {
                            message.setForeground(Color.BLACK);
                            message.setText("Awww man! The correct word was " + targetWord);

                        }
                        timerSet.pause();
                        

                    } else if (!checker.validWordCheck(fourthWord)) {
                        message.setForeground(Color.RED);
                        message.setText("Invalid word, try again!");
                    }

                }
            }
        });

        submit4.addActionListener((e) -> {
            String fourthWord = row4_1_1.getText() +row4_1_2.getText() +row4_1_3.getText() +row4_2_1.getText() +row4_2_2.getText() +row4_2_3.getText();
                
            if (checker.validWordCheck(fourthWord)) {
                row4SetEdit(false);

                submission.remove(submit4);
                submission.add(submit1, BorderLayout.NORTH);
                submit1.setEnabled(false);
                

                // for loop, if its 0/1/2, change the color
                String numbered = WordChecker.colorCode(fourthWord, targetWord); // what Cathal returns to me 
                ColorThread coloring = new ColorThread(numbered, fourthGuess);
                coloring.start();

                if (numbered.equals("222222")) {
                    correct();
                }
                else {
                    message.setForeground(Color.BLACK);
                    message.setText("Awww man! The correct word was " + targetWord);
                }
                timerSet.pause();
            
            } else if (!checker.validWordCheck(fourthWord)) {
                message.setForeground(Color.RED);
                message.setText("Invalid word, try again!");
            }
            
        });

        // action listeners that will only allow you to type in one letter per box
        row1_1_1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row1_1_1.getText().length() >= 1 )
                    e.consume(); 
            }});
        row1_1_2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row1_1_2.getText().length() >= 1 )
                    e.consume(); 
            }});
        row1_1_3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row1_1_3.getText().length() >= 1 )
                    e.consume(); 
            }});
        row1_2_1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row1_2_1.getText().length() >= 1 )
                    e.consume(); 
            }});
        row1_2_2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row1_2_2.getText().length() >= 1 )
                    e.consume(); 
                }});
        row1_2_3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row1_2_3.getText().length() >= 1 )
                    e.consume(); 
                }});
        row2_1_1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row2_1_1.getText().length() >= 1 )
                    e.consume(); 
                }});
        row2_1_2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row2_1_2.getText().length() >= 1 )
                    e.consume(); 
                }});
        row2_1_3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row2_1_3.getText().length() >= 1 )
                    e.consume(); 
                }});
        row2_2_1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row2_2_1.getText().length() >= 1 )
                    e.consume(); 
                }});
        row2_2_2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row2_2_2.getText().length() >= 1 )
                    e.consume(); 
                }});
        row2_2_3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row2_2_3.getText().length() >= 1 )
                    e.consume(); 
                }});
        row3_1_1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row3_1_1.getText().length() >= 1 )
                    e.consume(); 
                }});
        row3_1_2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row3_1_2.getText().length() >= 1 )
                    e.consume(); 
                }});
        row3_1_3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row3_1_3.getText().length() >= 1 )
                    e.consume(); 
                }});
        row3_2_1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row3_2_1.getText().length() >= 1 )
                    e.consume(); 
                }});
        row3_2_2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row3_2_2.getText().length() >= 1 )
                    e.consume(); 
                }});
        row3_2_3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row3_2_3.getText().length() >= 1 )
                    e.consume(); 
                }});
        row4_1_1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row4_1_1.getText().length() >= 1 )
                    e.consume(); 
                }});
        row4_1_2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row4_1_2.getText().length() >= 1 )
                    e.consume(); 
                }});
        row4_1_3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row4_1_3.getText().length() >= 1 )
                    e.consume(); 
                }});
        row4_2_1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row4_2_1.getText().length() >= 1 )
                    e.consume(); 
                }});
        row4_2_2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row4_2_2.getText().length() >= 1 )
                    e.consume(); 
                }});
        row4_2_3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (row4_2_3.getText().length() >= 1 )
                    e.consume(); 
                }});
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // back to the class, constructor ended

    public static void setTime (String time2) {
        //JOptionPane.showMessageDialog(this,"Your time has run out!","The game will now restart.",JOptionPane.ERROR_MESSAGE);
        status.setText("Time Remaining: " + time2);
        if(time2.equals("0")){
            row1SetEdit(false);
            row2SetEdit(false);
            row3SetEdit(false);
            row4SetEdit(false);
            timerSet.pause();

            message.setText("The correct word was " + targetWord);
        }

    }
    
    public void correct(){
        timerSet.pause();
        message.setForeground(Color.GREEN);
        message.setText("Congratulations, You Are Correct!");
        
        row1SetEdit(false);
        row2SetEdit(false);
        row3SetEdit(false);
        row4SetEdit(false);

        try{
            submission.remove(submit2);
        } catch(Exception e){}

        try{
            submission.remove(submit2);
        } catch(Exception e){}

        try{
            submission.remove(submit3);
        } catch(Exception e){}

        try{
            submission.remove(submit4);
        } catch(Exception e){}

        
        submission.add(submit1, BorderLayout.NORTH);
        submit1.setEnabled(false);
    }

    //Makes the first row editable or uneditable
    public static void row1SetEdit(boolean show){
        row1_1_1.setEditable(show);
        row1_1_2.setEditable(show);
        row1_1_3.setEditable(show);
        row1_2_1.setEditable(show);
        row1_2_2.setEditable(show);
        row1_2_3.setEditable(show);
    }

    //Makes the second row editable or uneditable
    public static void row2SetEdit(boolean show){
        row2_1_1.setEditable(show);
        row2_1_2.setEditable(show);
        row2_1_3.setEditable(show);
        row2_2_1.setEditable(show);
        row2_2_2.setEditable(show);
        row2_2_3.setEditable(show);
    }

    //Makes the third row editable or uneditable
    public static void row3SetEdit(boolean show){
        row3_1_1.setEditable(show);
        row3_1_2.setEditable(show);
        row3_1_3.setEditable(show);
        row3_2_1.setEditable(show);
        row3_2_2.setEditable(show);
        row3_2_3.setEditable(show);
    } 

    ////Makes the fourth row editable or uneditable
    public static void row4SetEdit(boolean show){
        row4_1_1.setEditable(show);
        row4_1_2.setEditable(show);
        row4_1_3.setEditable(show);
        row4_2_1.setEditable(show);
        row4_2_2.setEditable(show);
        row4_2_3.setEditable(show);
    }       

}