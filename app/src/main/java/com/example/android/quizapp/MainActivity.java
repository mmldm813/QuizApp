package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view) {
        int totalPoints = 0;

        if (isQuestionOneCorrect()) {
            totalPoints = 1;
        }
        if (isQuestionTwoCorrect()) {
            totalPoints = totalPoints + 1;
        }
        if (isQuestionThreeCorrect()) {
            totalPoints = totalPoints + 1;
        }
        if (isQuestionFourCorrect()) {
            totalPoints = totalPoints + 1;
        }
        if (isQuestionFiveCorrect()) {
            totalPoints = totalPoints + 1;
        }
        if (isQuestionSixCorrect()) {
            totalPoints = totalPoints + 1;
        }
        if (isQuestionSevenCorrect()) {
            totalPoints = totalPoints + 1;
        }

        String result;
        if (totalPoints == 7) {
            result = "passed";
        } else {
            result = "failed";
        }

        Toast.makeText(this, getString(R.string.total_points) + totalPoints + "/7 " + result,
                Toast.LENGTH_LONG).show();
    }

    public boolean isQuestionOneCorrect() {
        RadioGroup questionOne = (RadioGroup) findViewById(R.id.question_one);
        if (questionOne.getCheckedRadioButtonId() == R.id.cronus_answer) {
            return true;
        }
        return false;
    }

    public boolean isQuestionTwoCorrect() {
        RadioGroup questionTwo = (RadioGroup) findViewById(R.id.question_two);
        if (questionTwo.getCheckedRadioButtonId() == R.id.zeus_answer) {
            return true;
        }
        return false;
    }

    public boolean isQuestionThreeCorrect() {
        RadioGroup questionThree = (RadioGroup) findViewById(R.id.question_three);
        if (questionThree.getCheckedRadioButtonId() == R.id.earthquakes_answer) {
            return true;
        }
        return false;
    }

    public boolean isQuestionFourCorrect() {
        RadioGroup questionFour = (RadioGroup) findViewById(R.id.question_four);
        if (questionFour.getCheckedRadioButtonId() == R.id.persephone_answer) {
            return true;
        }
        return false;

    }

    public boolean isQuestionFiveCorrect() {
        RadioGroup questionFive = (RadioGroup) findViewById(R.id.question_five);
        if (questionFive.getCheckedRadioButtonId() == R.id.caduceus_answer) {
            return true;
        }
        return false;
    }

    public boolean isQuestionSixCorrect() {
        CheckBox incorrectAnswer1 = (CheckBox) findViewById(R.id.persephone_wrong);
        CheckBox incorrectAnswer2 = (CheckBox) findViewById(R.id.aphrodite_wrong);
        if (incorrectAnswer1.isChecked()) {
            return false;
        }
        if (incorrectAnswer2.isChecked()) {
            return false;
        }

        CheckBox correctAnswer1 = (CheckBox) findViewById(R.id.hera_answer);
        CheckBox correctAnswer2 = (CheckBox) findViewById(R.id.metis_answer);
        CheckBox correctAnswer3 = (CheckBox) findViewById(R.id.leda_answer);
        if (correctAnswer1.isChecked() == false) {
            return false;
        }
        if (correctAnswer2.isChecked() == false) {
            return false;
        }
        if (correctAnswer3.isChecked() == false) {
            return false;
        }
        return true;

    }

    public boolean isQuestionSevenCorrect() {
        EditText writtenAnswer = (EditText) findViewById(R.id.written_answer);
        if (writtenAnswer.getText().toString().trim().equalsIgnoreCase("nike")) {
            return true;
        }
        return false;
    }
}


