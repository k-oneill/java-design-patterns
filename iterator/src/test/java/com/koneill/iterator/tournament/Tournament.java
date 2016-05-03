/**
 * The MIT License
 * Copyright (c) 2014 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.koneill.iterator.tournament;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Tournament, the collection class.
 * 
 */
public class Tournament {

  private List<Player> players;

  /**
   * Constructor
   */
  public Tournament() {
	players = new ArrayList<>();

	// Player name
	String[] playerList = new String[20];
	playerList[0] = "Goku";
	playerList[1] = "Gohan";
	playerList[2] = "Goten";
	playerList[3] = "Vegeta";
	playerList[4] = "Trunks";
	playerList[5] = "Kame-Sennin";
	playerList[6] = "Kuririn";
	playerList[7] = "Yamucha";
	playerList[8] = "Tenshinhan";
	playerList[9] = "Chaozu";
	playerList[10] = "Piccolo";
	playerList[11] = "Freeza";
	playerList[12] = "Cell";
	playerList[13] = "Majin-Boo";
	playerList[14] = "Android#18";
	playerList[15] = "Nappa";
	playerList[16] = "Raditz";
	playerList[17] = "Ginyu";
	
	// count player
	int count = 0;	
	for (int i = 0; i < playerList.length; i++) {
		if (playerList[i]!=(null)) {
			count++;
		}
	}
	System.out.println("出場選手" + count + "名");

	//shuffled number
	ArrayList<Integer> NumberList = new ArrayList<Integer>();
	for(int i = 0 ; i < count ; i++) {
		NumberList.add(i);
	 }
	Collections.shuffle(NumberList);
	
	//add player to players[]
	for (int i = 0; i < count; i++) {

		//int number = new java.util.Random().nextInt(count);
		int number =  NumberList.get(i);
		int j = 6;
		if (number >= 0 && number < j ) {
			players.add(new Player(Block.A, playerList[i]));
		
		} else if (number >= j && number < j*2 ) {
			players.add(new Player(Block.B, playerList[i]));
	
		} else if (number >= j*2 && number < j*3 ) {
			players.add(new Player(Block.C, playerList[i]));
			
		} else {
			System.out.println("over" + playerList[i]);
		}
	}	
  }

  Iterator iterator(Block block) {
    return new TournamentIterator(this, block);
  }

  /**
   * Get all players
   */
  public List<Player> getPlays() {
    List<Player> list = new ArrayList<>();
    list.addAll(players);
    return list;
  }

}
