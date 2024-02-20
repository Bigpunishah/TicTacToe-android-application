package com.example.tic_tac_toe_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Indication of player turn
    private boolean playerXTurn = true;

    //Buttons
    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;
    private ImageButton imageButton5;
    private ImageButton imageButton6;
    private ImageButton imageButton7;
    private ImageButton imageButton8;
    private ImageButton imageButton9;

    //Button for new game
    private Button newGameButton;

    //textview of the current players turn
    private TextView playerTurnTextView;

    //Hold the values of strings
    private String[][] tags = new String[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find ImageButtons by their ID's
        imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        imageButton9 = (ImageButton) findViewById(R.id.imageButton9);

        //Add a click listener to the boxes
        imageButton1.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        imageButton5.setOnClickListener(this);
        imageButton6.setOnClickListener(this);
        imageButton7.setOnClickListener(this);
        imageButton8.setOnClickListener(this);
        imageButton9.setOnClickListener(this);


        //Restart button
        newGameButton = (Button) findViewById(R.id.newGameButton);
        newGameButton.setOnClickListener(this);


        //Find the textview of players turn
        playerTurnTextView = (TextView) findViewById(R.id.playerTurnTextView);
    } //End onCreate


    //On click the use will click a box
    //Then the box will toggle the method to switch turns
    //This code also changes the image to the respected image based on turn
    @Override
    public void onClick(View view) {
        if(playerXTurn) {
            switch (view.getId()) {
                case R.id.imageButton1:
                    if(checkTag(imageButton1)){
                        imageButton1.setImageResource(R.drawable.ttt_x);
                        imageButton1.setTag("X"); //Utilizing setTag to mark it with a value so it can be checked
                        tags[0][0] = "X"; //setting the value within the table
                    }
                    break;

                case R.id.imageButton2:
                    if(checkTag(imageButton2)){
                        imageButton2.setImageResource(R.drawable.ttt_x);
                        imageButton2.setTag("X");
                        tags[0][1] = "X";
                    }
                    break;

                case R.id.imageButton3:
                    if(checkTag(imageButton3)){
                        imageButton3.setImageResource(R.drawable.ttt_x);
                        imageButton3.setTag("X");
                        tags[0][2] = "X";
                    }
                    break;

                case R.id.imageButton4:
                    if(checkTag(imageButton4)){
                        imageButton4.setImageResource(R.drawable.ttt_x);
                        imageButton4.setTag("X");
                        tags[1][0] = "X";
                    }
                    break;

                case R.id.imageButton5:
                    if(checkTag(imageButton5)){
                        imageButton5.setImageResource(R.drawable.ttt_x);
                        imageButton5.setTag("X");
                        tags[1][1] = "X";
                    }
                    break;


                case R.id.imageButton6:
                    if(checkTag(imageButton6)){
                        imageButton6.setImageResource(R.drawable.ttt_x);
                        imageButton6.setTag("X");
                        tags[1][2] = "X";
                    }
                    break;


                case R.id.imageButton7:
                    if(checkTag(imageButton7)){
                        imageButton7.setImageResource(R.drawable.ttt_x);
                        imageButton7.setTag("X");
                        tags[2][0] = "X";
                    }
                    break;

                case R.id.imageButton8:
                    if(checkTag(imageButton8)){
                        imageButton8.setImageResource(R.drawable.ttt_x);
                        imageButton8.setTag("X");
                        tags[2][1] = "X";
                    }
                    break;

                case R.id.imageButton9:
                    if(checkTag(imageButton9)){
                        imageButton9.setImageResource(R.drawable.ttt_x);
                        imageButton9.setTag("X");
                        tags[2][2] = "X";
                    }
                    break;

                case R.id.newGameButton:
                    restartGame();
                    break;

            }//End switch
            checkForWin();
        }//End if
        else { //It is O turn
            switch (view.getId()) {
                case R.id.imageButton1:
                    if(checkTag(imageButton1)){
                        imageButton1.setImageResource(R.drawable.ttt_o);
                        imageButton1.setTag("O"); //Utilizing setTag to mark it with a value so it can be checked
                        tags[0][0] = "O";
                    }
                    break;

                case R.id.imageButton2:
                    if(checkTag(imageButton2)){
                        imageButton2.setImageResource(R.drawable.ttt_o);
                        imageButton2.setTag("O");
                        tags[0][1] = "O";
                    }
                    break;

                case R.id.imageButton3:
                    if(checkTag(imageButton3)){
                        imageButton3.setImageResource(R.drawable.ttt_o);
                        imageButton3.setTag("O");
                        tags[0][2] = "O";
                    }
                    break;

                case R.id.imageButton4:
                    if(checkTag(imageButton4)){
                        imageButton4.setImageResource(R.drawable.ttt_o);
                        imageButton4.setTag("O");
                        tags[1][0] = "O";
                    }
                    break;

                case R.id.imageButton5:
                    if(checkTag(imageButton5)){
                        imageButton5.setImageResource(R.drawable.ttt_o);
                        imageButton5.setTag("O");
                        tags[1][1] = "O";
                    }
                    break;

                case R.id.imageButton6:
                    if(checkTag(imageButton6)){
                        imageButton6.setImageResource(R.drawable.ttt_o);
                        imageButton6.setTag("O");
                        tags[1][2] = "O";
                    }
                    break;

                case R.id.imageButton7:
                    if(checkTag(imageButton7)){
                        imageButton7.setImageResource(R.drawable.ttt_o);
                        imageButton7.setTag("O");
                        tags[2][0] = "O";
                    }
                    break;

                case R.id.imageButton8:
                    if(checkTag(imageButton8)){
                        imageButton8.setImageResource(R.drawable.ttt_o);
                        imageButton8.setTag("O");
                        tags[2][1] = "O";
                    }
                    break;

                case R.id.imageButton9:
                    if(checkTag(imageButton9)){
                        imageButton9.setImageResource(R.drawable.ttt_o);
                        imageButton9.setTag("O");
                        tags[2][2] = "O";
                    }
                    break;
                case R.id.newGameButton:
                    restartGame();
                    break;
            } //End switch
            checkForWin();
        } // End else
    } // End onClick


    //This toggle allows the text to change & allow the correct user to play.
    public void togglePlayerXTurn(){
        if(playerXTurn) {
            playerXTurn = false;
            playerTurnTextView.setText("O's Turn");
//            Toast.makeText(this, "Good choice X! O's turn", Toast.LENGTH_SHORT).show();

        }
        else {
            playerXTurn = true;
            playerTurnTextView.setText("X's Turn");
//            Toast.makeText(this, "Great movie O! X's turn", Toast.LENGTH_SHORT).show();
        }

    }

    //Checks for tag of setTag() function
    public boolean checkTag(ImageButton imageButtonInput){
        if("O".equals(imageButtonInput.getTag())){
            Toast.makeText(this, "This cell is already in use! Try again", Toast.LENGTH_SHORT).show();
            return false;
        } else if("X".equals(imageButtonInput.getTag())) {
            Toast.makeText(this, "This cell is already in use! Try again", Toast.LENGTH_SHORT).show();
            return false;
        }
        else
            togglePlayerXTurn(); //If the box is unchecked then the players turn also changes
            return true;
    }

    private void checkForWin(){

        String winner = "";

        //Nested for-loop to check the 2d-array for the specific patterns
        for(int i = 0; i < 3; i++){
            //Checks rows
            if(tags[0][i] != null && tags[0][i].equals(tags[1][i]) && tags[0][i].equals(tags[2][i])){
                winner = tags[0][i];
                playerTurnTextView.setText(winner +" Won!");
            }

            //Checks column
            if(tags[i][0] != null && tags[i][0].equals(tags[i][1]) && tags[i][0].equals(tags[i][2])){
                winner = tags[i][0];
                playerTurnTextView.setText(winner +" Won!");
            }
        }

        //No loop needed to check diagonal
        //This checked one diagonal
        //[O][][]
        //[][O][]
        //[][][O]
        if(tags[0][0] != null && tags[0][0].equals(tags[1][1]) && tags[0][0].equals(tags[2][2])){
            winner = tags[0][0];
            playerTurnTextView.setText(winner +" Won!");
        }

        //Checking other way
        //[][][O]
        //[][O][]
        //[O][][]
        if(tags[0][2] != null && tags[0][2].equals(tags[1][2]) && tags[0][2].equals(tags[2][0])){
            winner = tags[0][2];
            playerTurnTextView.setText(winner +" Won!");
        }

        //Now checking if no one won
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(tags[i][j] != null){
                    continue;
                }
                else
                    return;
            }
        }
        playerTurnTextView.setText("No Winner!");
    }

    public void restartGame(){
        playerXTurn = true;
        playerTurnTextView.setText("X's Turn");
        imageButton1.setTag(null);
        imageButton1.setImageResource(android.R.color.transparent);
        imageButton2.setTag(null);
        imageButton2.setImageResource(android.R.color.transparent);

        imageButton3.setTag(null);
        imageButton3.setImageResource(android.R.color.transparent);
        imageButton4.setTag(null);
        imageButton4.setImageResource(android.R.color.transparent);

        imageButton5.setTag(null);
        imageButton5.setImageResource(android.R.color.transparent);
        imageButton6.setTag(null);
        imageButton6.setImageResource(android.R.color.transparent);

        imageButton7.setTag(null);
        imageButton7.setImageResource(android.R.color.transparent);
        imageButton8.setTag(null);
        imageButton8.setImageResource(android.R.color.transparent);

        imageButton9.setTag(null);
        imageButton9.setImageResource(android.R.color.transparent);

        //Clear the array
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tags[i][j] = null;
            }
        }

    }


}




