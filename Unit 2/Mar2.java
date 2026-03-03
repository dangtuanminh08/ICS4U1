/*
Logical operators worksheet:

1 a) (2 + (-5)) != 3  true
  b) 'm' <= 'p' true
  c) 'Q' == 'q' false
  d) '*' < '*' false
  e) 8.23 =< 8.2300 illegal, operater must be <=
  f) (7/3) = 2 illegal, operator must be ==
  g) false == 0 illegal, cannot compare two different types
  h) (25%4) >= 1 false

3 (a) 'q' < 'm' false
  (b) 'G' > 'K' false
  (c) 'a' < 'Z' true
  (d) '5' < 'v' true
  (e) 'q' > '7' true
  (f) '9' < ' ' false
  (g) 'X' < 'y' true
  (h) 'i' < 'I' false

1. True && True true
2. False && True false
3. 1 == 1 && 2 == 1 false
4. "test" && "test" illegal, must compare booleans not String
5. 1 == 1 || 2 != 1 true
6. True || 1 == 1 true
7. False || 0 != 0 false
8. True || 1 == 1 true
9. 1 != 0 && 2 == 1 false
10."test" != "testing" true
11."test" == 1 illegal, cannot compare two different types
12 .! (True && False) true
13 .! (1 == 1 && 0 != 1) false
14 .! (10 == 1 || 1000 == 1000) false
15 .! (1 != 10 || 3 ==4 ) false
16 .! ("testing" == "testing" && "Zed" == "Cool Guy") true
17.1 == 1 && (! ("testing" == 1 | | 1 == 0) ) illegal, cannot compare two different types
18."chunky" == "bacon" && (! (3 == 4 | | 3 == 3) ) false
19. 3 == 3 && (! ("testing" == "testing" | | "Python" == "Fun") ) false

*/