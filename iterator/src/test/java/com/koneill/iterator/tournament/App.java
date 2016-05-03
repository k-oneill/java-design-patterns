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

/**
 * announce a tournament player 
 * 
 */

public class App {

  public static void main(String[] args) {
    Tournament name = new Tournament();
   
	System.out.println("");    	
    System.out.println("--- A Block ---");
    
    Iterator aIterator = name.iterator(Block.A);
    while (aIterator.hasNext()) {
    	System.out.println(aIterator.next()+" vs "+aIterator.next());
    }

	System.out.println("");    	
    System.out.println("--- B Block ---");

    Iterator bIterator = name.iterator(Block.B);
    while (bIterator.hasNext()) {
    	System.out.println(bIterator.next()+" vs "+bIterator.next());
    }

	System.out.println("");    	
    System.out.println("--- C Block ---");

    Iterator cIterator = name.iterator(Block.C);
    while (cIterator.hasNext()) {
    	System.out.println(cIterator.next()+" vs "+cIterator.next());
    }

	System.out.println("");    	
    System.out.println("--- All Player's List ---");

    Iterator it = name.iterator(Block.ANY);
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
