package alPro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MindReaderNganu
{
	public static final int ANGKA_MAKS = 200;
	public static final int ANGKA_PER_PERTANYAAN = 50;
	
	private int pertanyaanSekarang = 0;
		private ArrayList<Integer> kemungkinanAngka = new ArrayList<Integer>();
		private ArrayList<Integer> angkaTertolak = new ArrayList<Integer>();
		private ArrayList<Integer> angkaPertanyaanSkrg = new ArrayList<Integer>();
		private ArrayList<Integer> angkaPertanyaanSekarangTapiDkTeguno = new ArrayList<Integer>();
	
	private JFrame frame;
		private JLabel intro = new JLabel("Pekeri angko dari 1-100 bestu mulai.");
		private JButton start = new JButton("Mulai");
		private JLabel nanyoDak = new JLabel();
		private JLabel nanyo = new JLabel("Ado dk angko kau?");
		private JLabel nanyoAngko = new JLabel();
		private JButton y = new JButton("Yo");
		private JButton g = new JButton("Dak");
		private JLabel teksHasil = new JLabel("Angko yg kau pekerke tu e:");
		private JLabel hasil = new JLabel();

	public static void main(String[] args)
	{
		new MindReaderNganu().buatGUI();
	}

	public void buatGUI()
	{
		frame = new JFrame("Mind Reader");
		frame.getContentPane().setLayout(new FlowLayout());
		start.addActionListener(new StartButtonListener());
		frame.getContentPane().add(BorderLayout.CENTER, intro);
		frame.getContentPane().add(BorderLayout.SOUTH, start);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(950,125);
		frame.setVisible(true);
	}

	public void start()
	{
		start.setVisible(false);
		intro.setVisible(false);
		
		for(int n = 1; n <= ANGKA_MAKS; n++)
		{
			kemungkinanAngka.add(n);
		}
		
		Collections.sort(kemungkinanAngka);
		question();
	}
	public void question()
	{
		pertanyaanSekarang++;
		if(pertanyaanSekarang == 1)
		{
			frame.getContentPane().add(BorderLayout.CENTER, nanyoDak);
			frame.getContentPane().add(BorderLayout.CENTER, nanyo);
			frame.getContentPane().add(BorderLayout.CENTER, nanyoAngko);
			frame.getContentPane().add(BorderLayout.SOUTH, y);
			frame.getContentPane().add(BorderLayout.SOUTH, g);
			y.addActionListener(new YesButtonListener());
			g.addActionListener(new NoButtonListener());
		}
		
		String pertanyaanTanpaString = "Question "+pertanyaanSekarang+":";
		nanyoDak.setText(pertanyaanTanpaString);

		if(kemungkinanAngka.size() > ANGKA_PER_PERTANYAAN)
		{
			for(int i = 0; i < ANGKA_PER_PERTANYAAN; i++)
			{
				angkaPertanyaanSkrg.add(kemungkinanAngka.get(i));
			}
			
			String pertanyaanStringBeangko = "";
			int iterasi = 1;
			for (int i : angkaPertanyaanSkrg)
			{
				if(iterasi != ANGKA_PER_PERTANYAAN)
				{
					pertanyaanStringBeangko += i + ", ";
				}
				else
				{
					pertanyaanStringBeangko += i;
				}
				iterasi++;
			}
			nanyoAngko.setText(pertanyaanStringBeangko);
		}
		else
		{
			int angkoYgNkDiembek = (int) (kemungkinanAngka.size() * 0.5);
			for(int i = 0; i < angkoYgNkDiembek; i++)
			{
				angkaPertanyaanSkrg.add(kemungkinanAngka.get(i));
				angkaPertanyaanSekarangTapiDkTeguno.add(kemungkinanAngka.get(i));
			}

			Collections.sort(angkaTertolak);
			int angkoYgNkDiembekAnu = ANGKA_PER_PERTANYAAN - angkoYgNkDiembek;
			for(int i = 0; i < angkoYgNkDiembekAnu; i++)
			{
				angkaPertanyaanSekarangTapiDkTeguno.add(angkaTertolak.get(i));
			}
			
			Collections.sort(angkaPertanyaanSekarangTapiDkTeguno);
			
			String pertanyaanStringBanyakAngko = "";
			int nganu = 1;
			for (int i : angkaPertanyaanSekarangTapiDkTeguno)
			{
				if(nganu != ANGKA_PER_PERTANYAAN)
				{
					pertanyaanStringBanyakAngko += i + ", ";
				}
				else
				{
					pertanyaanStringBanyakAngko += i;
				}
				nganu++;
			}
			nanyoAngko.setText(pertanyaanStringBanyakAngko);
		}
	}

	public void jawaban(boolean iniJawaban)
	{
		if(iniJawaban == true)
		{
			kemungkinanAngka.clear();
			angkaTertolak.clear();
			for(int i = 0; i < angkaPertanyaanSkrg.size(); i++)
			{
				kemungkinanAngka.add(angkaPertanyaanSkrg.get(i));
			}
			
			Collections.sort(kemungkinanAngka);
			for(int i = 0, number = 1; i < ANGKA_MAKS; i++, number++)
			{
				if(kemungkinanAngka.contains(number))
				{
					continue;
				}
				angkaTertolak.add(number);
			}
			Collections.sort(angkaTertolak);
		}
		else
		{
			for(int i = 0; i < angkaPertanyaanSkrg.size(); i++)
			{
				kemungkinanAngka.remove(0);
			}
			for(int i = 0; i < angkaPertanyaanSkrg.size(); i++)
			{
				angkaTertolak.add(angkaPertanyaanSkrg.get(i));
			}
		}

		if(kemungkinanAngka.size() == 1)
		{
			result();
		}
		else
		{
			angkaPertanyaanSkrg.clear();
			angkaPertanyaanSekarangTapiDkTeguno.clear();
			question();
		}

	}
	
	public void result()
	{
		nanyoDak.setVisible(false);
		nanyo.setVisible(false);
		nanyoAngko.setVisible(false);
		y.setVisible(false);
		g.setVisible(false);
		int resultNumber = kemungkinanAngka.get(0);
		hasil.setText(String.valueOf(resultNumber));
		frame.getContentPane().add(BorderLayout.CENTER, teksHasil);
		frame.getContentPane().add(BorderLayout.CENTER, hasil);
	}
	
	public class StartButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent a)
		{
			start();
		}
	}
	
	public class YesButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent a)
		{
			jawaban(true);
		}
	}
	
	public class NoButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent a)
		{
			jawaban(false);
		}
	}
}