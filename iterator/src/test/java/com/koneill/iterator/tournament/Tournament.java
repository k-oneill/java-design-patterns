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
import java.util.List;

//import com.oneill.dragonball.Announcement.Name;

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
	
	//Block A Elimination
	players.add(new Player(Block.A, "Goku"));
	players.add(new Player(Block.A, "Kame-Sennin"));
	players.add(new Player(Block.A, "Yamucha"));
	players.add(new Player(Block.A, "Kuririn"));
	players.add(new Player(Block.A, "Tenshinhan"));

	//Block B Elimination
	players.add(new Player(Block.B, "Piccolo"));
	players.add(new Player(Block.B, "Freeza"));
	players.add(new Player(Block.B, "Cell"));
	players.add(new Player(Block.B, "Majin-Boo"));

	//Block C Elimination
	players.add(new Player(Block.C, "Vegeta"));
	players.add(new Player(Block.C, "Nappa"));
	players.add(new Player(Block.C, "Bordock"));
	players.add(new Player(Block.C, "Radotz"));
	players.add(new Player(Block.C, "Broly"));
	players.add(new Player(Block.C, "Saibai-Man"));    
  }

  Iterator iterator(Block Block) {
    return new TournamentIterator(this, Block);
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
