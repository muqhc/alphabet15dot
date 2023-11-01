val alphabet15dotASCIIMap = mapOf(

    ' ' to listOf(),

    '!' to listOf(listOf(10,11,12),listOf(14)),

    '"' to listOf(listOf( 0, 1),listOf(10,11)),

    '#' to listOf(listOf(11, 4),listOf(21,14),listOf( 2,22),listOf( 3,23)),

    '$' to listOf(listOf(20, 0, 2,22,24, 4),listOf(10,14)),

    '%' to listOf(listOf( 0,10,11, 1, 0),listOf(20, 4),listOf(13,23)),

    '&' to listOf(listOf(22,23,14, 3,21,10, 1, 2,24)),

    "'"[0] to listOf(listOf(10,11)),

    '(' to listOf(listOf(10, 1, 2, 3,14)),

    ')' to listOf(listOf(10,21,22,23,14)),

    '*' to listOf(listOf( 0,22),listOf(20, 2),listOf( 1,21)),

    '+' to listOf(listOf(11,13),listOf( 2,22)),

    ',' to listOf(listOf(23,14)),

    '-' to listOf(listOf( 2,12)),

    '.' to listOf(listOf(14)),

    '/' to listOf(listOf(20, 4)),

    '0' to listOf(listOf(10, 1, 3,14,23,21,10)),

    '1' to listOf(listOf( 1,10,14)),

    '2' to listOf(listOf( 0,10,21, 3, 4,24)),

    '3' to listOf(listOf( 0,10,21,12, 2),listOf(12,23,14, 4)),

    '4' to listOf(listOf(22, 2,10,14)),

    '5' to listOf(listOf(20, 0, 2,12,23,14, 4)),

    '6' to listOf(listOf(10, 1, 3,14,23,12, 3)),

    '7' to listOf(listOf( 0,20,21,12,14)),

    '8' to listOf(listOf(14,23, 1,10,21, 3,14)),

    '9' to listOf(listOf(21,12, 1,10,21,23,14, 3)),

    ':' to listOf(listOf(11),listOf(13)),

    ';' to listOf(listOf(11),listOf(13, 4)),

    '<' to listOf(listOf(21, 2,23)),

    '=' to listOf(listOf( 1,21),listOf( 3,23)),

    '>' to listOf(listOf( 1,22, 3)),

    '?' to listOf(listOf( 1,10,21,12,13),listOf(14)),

    '@' to listOf(listOf(22,13, 2,11,22,23,21,10, 1, 3,14)),

    'A' to listOf(listOf( 4, 1,10,21,24),listOf( 2,22)),

    'B' to listOf(listOf( 0, 4,14,23,12, 2),listOf(12,21,10, 0)),

    'C' to listOf(listOf(21,10, 1, 3,14,23)),

    'D' to listOf(listOf( 0, 4,14,23,21,10, 0)),

    'E' to listOf(listOf(20, 0, 2,22),listOf( 2, 3, 4,24)),

    'F' to listOf(listOf(20, 0, 4),listOf(22, 2)),

    'G' to listOf(listOf(21,10, 1, 3,14,23,22,12)),

    'H' to listOf(listOf( 0, 4),listOf( 2,22),listOf(20,24)),

    'I' to listOf(listOf(10,14)),

    'J' to listOf(listOf(10,13, 4)),

    'K' to listOf(listOf( 0, 4),listOf(20, 2,24)),

    'L' to listOf(listOf( 0, 4,24)),

    'M' to listOf(listOf( 4, 0,12,20,24)),

    'N' to listOf(listOf( 4, 0,24,20)),

    'O' to listOf(listOf(10, 1, 3,14,23,21,10)),

    'P' to listOf(listOf( 4, 0,10,21,12, 2)),

    'Q' to listOf(listOf(10, 1, 3,14,23,21,10),listOf(13,24)),

    'R' to listOf(listOf( 4, 0,10,21,12, 2,24)),

    'S' to listOf(listOf(20,10, 1,23,14, 4)),

    'T' to listOf(listOf( 0,20),listOf(10,14)),

    'U' to listOf(listOf( 0, 3,14,23,20)),

    'V' to listOf(listOf( 0,14,20)),

    'W' to listOf(listOf( 0, 4,12,24,20)),

    'X' to listOf(listOf( 0,24),listOf(20, 4)),

    'Y' to listOf(listOf( 0,12,14),listOf(20,12)),

    'Z' to listOf(listOf( 0,20, 4,24)),

    '[' to listOf(listOf(10, 0, 4,14)),

    "\\"[0] to listOf(listOf( 0,24)),

    ']' to listOf(listOf(10,20,24,14)),

    '^' to listOf(listOf( 1,10,21)),

    '_' to listOf(listOf( 4,24)),

    '`' to listOf(listOf( 0,11)),

    'a' to listOf(listOf( 2,22,24, 4, 3,23)),

    'b' to listOf(listOf( 0, 4,14,23,12, 2)),

    'c' to listOf(listOf(22,12, 3,14,24)),

    'd' to listOf(listOf(20,24,14, 3,12,22)),

    'e' to listOf(listOf( 3,23,12, 3, 4,14)),

    'f' to listOf(listOf(20,11,14),listOf( 2,22)),

    'g' to listOf(listOf(22,13, 2,11,22,23,14, 4)),

    'h' to listOf(listOf( 0, 4),listOf( 3,12,23,24)),

    'i' to listOf(listOf(11),listOf(12,14)),

    'j' to listOf(listOf(11),listOf(13,14, 4)),

    'k' to listOf(listOf( 0, 4),listOf(12, 3,14)),

    'l' to listOf(listOf(11,14,24)),

    'm' to listOf(listOf( 2, 4),listOf( 3,12,14),listOf(13,22,24)),

    'n' to listOf(listOf( 2, 4),listOf( 3,12,22,24)),

    'o' to listOf(listOf(12, 3,14,23,12)),

    'p' to listOf(listOf( 1, 4),listOf( 2,11,22,13, 3)),

    'q' to listOf(listOf(21,24),listOf(22, 2,13,23)),

    'r' to listOf(listOf( 2, 4),listOf( 3,12,22)),

    's' to listOf(listOf(22,12, 3,23,14, 4)),

    't' to listOf(listOf( 2,22),listOf(11,14,24)),

    'u' to listOf(listOf( 2, 3, 4,14,23),listOf(22,24)),

    'v' to listOf(listOf( 2,14,22)),

    'w' to listOf(listOf( 2, 4,13,24,22)),

    'x' to listOf(listOf( 2,24),listOf(22, 4)),

    'y' to listOf(listOf( 1,13),listOf(21,13, 4)),

    'z' to listOf(listOf( 2,22, 4,24)),

    '{' to listOf(listOf(20,10,11, 2,13,14,24)),

    '|' to listOf(listOf(10,14)),

    '}' to listOf(listOf( 0,10,11,22,13,14, 4)),

    '~' to listOf(listOf( 2,11,12,22)),

)
