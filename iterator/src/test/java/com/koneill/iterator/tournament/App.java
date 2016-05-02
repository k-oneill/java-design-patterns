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
    Tournament chest = new Tournament();
   
    System.out.println("--- A Block Elimnation ---");

    Iterator moneyIterator = chest.iterator(Block.A);
    while (moneyIterator.hasNext()) {
      System.out.println(moneyIterator.next());
    }

    System.out.println("--- B Block Elimnation ---");

    Iterator ringIterator = chest.iterator(Block.B);
    while (ringIterator.hasNext()) {
      System.out.println(ringIterator.next());
    }

    System.out.println("--- C Block Elimnation ---");

    Iterator potionIterator = chest.iterator(Block.C);
    while (potionIterator.hasNext()) {
      System.out.println(potionIterator.next());
    }

    System.out.println("--- All Player's List ---");

    Iterator it = chest.iterator(Block.ANY);
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
