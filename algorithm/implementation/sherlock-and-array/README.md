<div class="content-text challenge-text mlB">
                <div class="msB"><p><strong>Problem Statement</strong></p></div><div class="msB"><p><a href="https://hr-filepicker.s3.amazonaws.com/101may14/russian/2490-sherlock-and-array.pdf">Русский</a> \| 
<a href="https://hr-filepicker.s3.amazonaws.com/101may14/chinese/2490-sherlock-and-array.pdf">中文</a><br>
Watson gives an array <em>A<sub>1</sub>,A<sub>2</sub>...A<sub>N</sub></em> to Sherlock. Then he asks him to find if there exists an element in the array, such that, the sum of elements on its left is equal to the sum of elements on its right. If there are no elements to left/right, then sum is considered to be zero. <br>
Formally, find an <em>i</em>, such that, <em>A<sub>1</sub>+A<sub>2</sub>...A<sub>i-1</sub></em>  = <em>A<sub>i+1</sub>+A<sub>i+2</sub>...A<sub>N</sub></em>.</p>

<p><strong>Input Format</strong> <br>
The first line contains <em>T</em>, the number of test cases. For each test case, the first line contains <em>N</em>, the number of elements in the array <em>A</em>. The second line for each testcase contains <em>N</em> space separated integers, denoting the array <em>A</em>.   </p>

<p><strong>Output Format</strong> <br>
For each test case, print <code>YES</code> if there exists an element in the array, such that, the sum of elements on its left is equal to the sum of elements on its right, else print <code>NO</code>.  </p>

<p><strong>Constraints</strong> <br>
1 ≤ T ≤ 10 <br>
1 ≤ N ≤ 10<sup>5</sup> <br>
1 ≤ A<sub>i</sub> ≤ 2*10<sup>4</sup> for 1 ≤ i ≤ N</p>

<p><strong>Sample Input</strong>   </p>

<pre><code>2
3
1 2 3
4
1 2 3 3
</code></pre>

<p><strong>Sample Output</strong></p>

<pre><code>NO
YES
</code></pre>

<p><strong>Explanation</strong> <br>
For test case 1, no such index exists. <br>
For test case 2, <span class="MathJax_Preview"></span><span class="MathJax" id="MathJax-Element-7-Frame" role="textbox" aria-readonly="true" style=""><nobr><span class="math" id="MathJax-Span-27" style="width: 11.292em; display: inline-block;"><span style="display: inline-block; position: relative; width: 7.998em; height: 0px; font-size: 141%;"><span style="position: absolute; clip: rect(1.772em, 1000em, 3.008em, -0.32em); top: -2.64em; left: 0em;"><span class="mrow" id="MathJax-Span-28"><span class="mi" id="MathJax-Span-29" style="font-family: MathJax_Math; font-style: italic;">A</span><span class="mo" id="MathJax-Span-30" style="font-family: MathJax_Main;">[</span><span class="mn" id="MathJax-Span-31" style="font-family: MathJax_Main;">1</span><span class="mo" id="MathJax-Span-32" style="font-family: MathJax_Main;">]</span><span class="mo" id="MathJax-Span-33" style="font-family: MathJax_Main; padding-left: 0.222em;">+</span><span class="mi" id="MathJax-Span-34" style="font-family: MathJax_Math; font-style: italic; padding-left: 0.222em;">A</span><span class="mo" id="MathJax-Span-35" style="font-family: MathJax_Main;">[</span><span class="mn" id="MathJax-Span-36" style="font-family: MathJax_Main;">2</span><span class="mo" id="MathJax-Span-37" style="font-family: MathJax_Main;">]</span><span class="mo" id="MathJax-Span-38" style="font-family: MathJax_Main; padding-left: 0.278em;">=</span><span class="mi" id="MathJax-Span-39" style="font-family: MathJax_Math; font-style: italic; padding-left: 0.278em;">A</span><span class="mo" id="MathJax-Span-40" style="font-family: MathJax_Main;">[</span><span class="mn" id="MathJax-Span-41" style="font-family: MathJax_Main;">4</span><span class="mo" id="MathJax-Span-42" style="font-family: MathJax_Main;">]</span></span><span style="display: inline-block; width: 0px; height: 2.64em;"></span></span></span><span style="border-left: 0em solid; display: inline-block; overflow: hidden; width: 0px; height: 1.521em; vertical-align: -0.408em;"></span></span></nobr></span><script type="math/tex" id="MathJax-Element-7">A[1] + A[2] = A[4]</script>, therefore index 3 satisfies.</p></div>
            </div>