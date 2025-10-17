# ppj_w2
Przedstawiony na wykładzie 2 algorytm sumuje liczby całkowite za pomocą następujących operacji bitowych do momentu aż niemożliwe będzie kolejne przesunięcie:
1. **XOR** (alternatywa rozłączna), która zwraca 1 gdzie dwa bity o tej samej pozycji w obu liczbach mają różny stan (0 i 1)
2. **AND** (koniunkcja)
3. **przesunięcia bitowego** w lewo o 1 pozycję



Działanie algorytmu na przykładowych liczbach:<br>
a = 6<br>
b = 5

1) Iteracja:<br>
   a) Operacja bitowa XOR ^ (alternatywa rozłączna)<br>
    - **a₁₀**: 6 | **a₂**: 110<br>
   ^
    - **b₁₀**: 5 | **b₂**: 101<br>
   =
    - **c₁₀**: 3 | **c₂**: 011<br>

   b) Operacja bitowa AND & (koniunkcja)<br>
    - **a₁₀**: 6 | **a₂**: 110<br>
    &
    - **b₁₀**: 5 | **b₂**: 101<br>
    =
    - **d₁₀**: 4 | **d₂**: 100<br>

   c) Operacja przesunięcia bitowego w lewo << o 1 pozycję<br>
    - **d₁₀**: 4 | **d₂**: 0100<br>
    << 1 bit
    - **d₁₀**: 8 | **d₂**: 1000<br>

   d) d != 0 więc zmiennym a i b przypisywane są wartości odpowiednio c i d<br>

2) Iteracja:<br>
   a) Operacja bitowa XOR ^ (alternatywa rozłączna)<br>
    - **a₁₀**:  3 | **a₂**: 0011<br>
    ^
    - **b₁₀**:  8 | **b₂**: 1000<br>
    =
    - **c₁₀**: 11 | **c₂**: 1011<br>

   b) Operacja bitowa AND & (koniunkcja)<br>
    - **a₁₀**:  3 | **a₂**: 0011<br>
    &
    - **b₁₀**:  8 | **b₂**: 1000<br>
    =
    - **d₁₀**:  0 | **d₂**: 0000<br>
    - żadna para odpowiadających sobie bitów nie spełnia koniunkcji, czyli nie ma pary bitów o wartości 1<br>

   c) Operacja przesunięcia bitowego w lewo << o 1 pozycję<br>
    - **d₁₀**:  0 | **d₂**: 0000<br>
    << 1 bit
    - **d₁₀**:  0 | **d₂**: 0000<br>
    - w tym momencie nie ma już żadnych bitów o stanie 1 do przesunięcia,<br> d = 0, więc algorytm kończy iterację pętli<br>
3) Wynik
    - **c₁₀**: 11 | **c₂**: 1011
    - wyświetla się wynik będący liczbą całkowitą, która jest sumą liczb wejściowych 5 i 6 w systemie dziesiętnym
