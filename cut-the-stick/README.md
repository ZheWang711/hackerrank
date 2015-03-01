<div class="content-text challenge-text mlB">
                <div class="msB"><p><strong>Problem Statement</strong></p></div><div class="msB"><p>You are given <strong>N</strong> sticks, where each stick is of positive integral length. A <em>cut operation</em> is performed on the sticks such that all of them are reduced <em>by</em> the length of the smallest stick. </p>

<p>Suppose we have 6 sticks of length</p>

<pre><code>5 4 4 2 2 8
</code></pre>

<p>then in one <em>cut operation</em> we make a cut of length 2 from each of the 6 sticks. For next <em>cut operation</em> 4 sticks are left (of non-zero length), whose length are</p>

<pre><code>3 2 2 6
</code></pre>

<p>Above step is repeated till no sticks are left.</p>

<p>Given length of <strong>N</strong> sticks, print the number of sticks that are cut in subsequent <em>cut operations</em>. </p>

<p><strong>Input Format</strong> <br>
The first line contains a single integer <em>N</em>. <br>
The next line contains <em>N</em> integers: <em>a<sub>0</sub>, a<sub>1</sub>,...a<sub>N-1</sub></em>  separated by space, where <em>a<sub>i</sub></em> represents the length of <em>i<sup>th</sup></em> stick.</p>

<p><strong>Output Format</strong> <br>
For each operation, print the number of sticks that are cut in separate line.  </p>

<p><strong>Constraints</strong> <br>
1 ≤ <em>N</em> ≤ 1000 <br>
1 ≤ <em>a<sub>i</sub></em> ≤ 1000</p>

<p><strong>Sample Input #00</strong></p>

<pre><code>6
5 4 4 2 2 8
</code></pre>

<p><strong>Sample Output #00</strong></p>

<pre><code>6
4
2
1
</code></pre>

<p><strong>Sample Input #01</strong></p>

<pre><code>8
1 2 3 4 3 3 2 1
</code></pre>

<p><strong>Sample Output #01</strong></p>

<pre><code>8
6
4
1
</code></pre>

<p><strong>Explanation</strong>  </p>

<p><em>Sample Case #00 :</em> </p>

<pre><code>sticks-length        length-of-cut   sticks-cut
5 4 4 2 2 8             2               6
3 2 2 _ _ 6             2               4
1 _ _ _ _ 4             1               2
_ _ _ _ _ 3             3               1
_ _ _ _ _ _           DONE            DONE
</code></pre>

<p><em>Sample Case #01</em></p>

<pre><code>sticks-length         length-of-cut   sticks-cut
1 2 3 4 3 3 2 1         1               8
_ 1 2 3 2 2 1 _         1               6
_ _ 1 2 1 1 _ _         1               4
_ _ _ 1 _ _ _ _         1               1
_ _ _ _ _ _ _ _       DONE            DONE
</code></pre></div>