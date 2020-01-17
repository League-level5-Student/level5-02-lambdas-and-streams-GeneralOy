package _00_JButtons_with_Lambdas;

import java.awt.Desktop.Action;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private int no = 0;
	private Random rando = new Random();
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");

	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);

		// 1. Call the addActionListener methods for each button. Use lambdas
		// to define to functionality of the buttons.
		addNumbers.addActionListener((e) -> {
			System.out.println("hi add");
			no += 2;
			JOptionPane.showMessageDialog(null, no);
		});
		randNumber.addActionListener((e) -> {
			System.out.println("hi rand");
			JOptionPane.showMessageDialog(null, rando.nextInt(1000));
		});
		tellAJoke.addActionListener((e) -> {
			System.out.println("hi joke");
			JOptionPane.showMessageDialog(null,
					"Why did the Prophet of Truth call Allstate when the Parasite attacked? \n\nBecause he wanted to make sure he had Flood insurance :^)");
		});
		window.setVisible(true);
		window.pack();
	}

	public static void main(String[] args) {
		new LambdaButtons();
	}

}
