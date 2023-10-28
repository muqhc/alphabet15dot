val alphabet14dotMap = mapOf(
    ' ' to arrayOf(),
    '!' to arrayOf(arrayOf(10,11,12),arrayOf(14)),
    '"' to arrayOf(arrayOf(00,01),arrayOf(10,11)),
    '#' to arrayOf(arrayOf(11,04),arrayOf(21,14),arrayOf(02,22),arrayOf(03,23)),
    '$' to arrayOf(arrayOf(20,00,02,22,24,04),arrayOf(10,14)),
    '%' to arrayOf(arrayOf(00,10,11,01,00),arrayOf(20,04),arrayOf(13,23)),
    '&' to arrayOf(arrayOf(22,23,14,03,21,10,01,02,24)),
    '\''to arrayOf(arrayOf(10,11)),
    '(' to arrayOf(arrayOf(10,01,02,03,14)),
    ')' to arrayOf(arrayOf(10,21,22,23,14)),
    '*' to arrayOf(arrayOf(00,22),arrayOf(20,02),arrayOf(01,21)),
    '+' to arrayOf(arrayOf(11,13),arrayOf(02,22)),
    ',' to arrayOf(arrayOf(23,14)),
    '-' to arrayOf(arrayOf(02,12)),
    '.' to arrayOf(arrayOf(14)),
    '/' to arrayOf(arrayOf(20,04)),
    '0' to arrayOf(arrayOf(10,01,03,14,23,21,10)),
    '1' to arrayOf(arrayOf(01,10,14)),
    '2' to arrayOf(arrayOf(00,10,21,03,04,24)),
    '3' to arrayOf(arrayOf(00,10,21,12,02),arrayOf(12,23,14,04)),
    '4' to arrayOf(arrayOf(22,02,10,14)),
    '5' to arrayOf(arrayOf(20,00,02,12,23,14,04)),
    '6' to arrayOf(arrayOf(10,01,03,14,23,12,03)),
    '7' to arrayOf(arrayOf(00,20,21,12,14)),
    '8' to arrayOf(arrayOf(14,23,01,10,21,03,14)),
    '9' to arrayOf(arrayOf(21,12,01,10,21,23,14,03)),
    ':' to arrayOf(arrayOf(11),arrayOf(13)),
    ';' to arrayOf(arrayOf(11),arrayOf(13,04)),
    '<' to arrayOf(arrayOf(21,02,23)),
    '=' to arrayOf(arrayOf(01,21),arrayOf(03,23)),
    '>' to arrayOf(arrayOf(01,22,03)),
    '?' to arrayOf(arrayOf(01,10,21,12,13),arrayOf(14)),
    '@' to arrayOf(arrayOf(22,13,02,11,22,23,21,10,01,03,14)),
    'A' to arrayOf(arrayOf(04,01,10,21,24),arrayOf(02,22)),
    'B' to arrayOf(arrayOf(00,04,14,23,12,02),arrayOf(12,21,10,00)),
    'C' to arrayOf(arrayOf(21,10,01,03,14,23)),
    'D' to arrayOf(arrayOf(00,04,14,23,21,10,00)),
    'E' to arrayOf(arrayOf(20,00,02,22),arrayOf(02,03,04,24)),
    'F' to arrayOf(arrayOf(20,00,04),arrayOf(22,02)),
    'G' to arrayOf(arrayOf(21,10,01,03,14,23,22,12)),
    'H' to arrayOf(arrayOf(00,04),arrayOf(02,22),arrayOf(20,24)),
    'I' to arrayOf(arrayOf(10,14)),
    'J' to arrayOf(arrayOf(10,13,04)),
    'K' to arrayOf(arrayOf(00,04),arrayOf(20,02,24)),
    'L' to arrayOf(arrayOf(00,04,24)),
    'M' to arrayOf(arrayOf(04,00,12,20,24)),
    'N' to arrayOf(arrayOf(04,00,24,20)),
    'O' to arrayOf(arrayOf(10,01,03,14,23,21,10)),
    'P' to arrayOf(arrayOf(04,00,10,21,12,02)),
    'Q' to arrayOf(arrayOf(10,01,03,14,23,21,10),arrayOf(13,24)),
    'R' to arrayOf(arrayOf(04,00,10,21,12,02,24)),
    'S' to arrayOf(arrayOf(20,10,01,23,14,04)),
    'T' to arrayOf(arrayOf(00,20),arrayOf(10,14)),
    'U' to arrayOf(arrayOf(00,03,14,23,20)),
    'V' to arrayOf(arrayOf(00,14,20)),
    'W' to arrayOf(arrayOf(00,04,12,24,20)),
    'X' to arrayOf(arrayOf(00,24),arrayOf(20,04)),
    'Y' to arrayOf(arrayOf(00,12,14),arrayOf(20,12)),
    'Z' to arrayOf(arrayOf(00,20,04,24)),
    '[' to arrayOf(arrayOf(10,00,04,14)),
    '\\'to arrayOf(arrayOf(00,24)),
    ']' to arrayOf(arrayOf(10,20,24,14)),
    '^' to arrayOf(arrayOf(01,10,21)),
    '_' to arrayOf(arrayOf(04,24)),
    '`' to arrayOf(arrayOf(00,11)),
    'a' to arrayOf(arrayOf(02,22,24,04,03,23)),
    'b' to arrayOf(arrayOf(00,04,24,22,02)),
    'c' to arrayOf(arrayOf(22,12,03,14,24)),
    'd' to arrayOf(arrayOf(20,24,14,03,12,22)),
    'e' to arrayOf(arrayOf(03,23,12,03,04,14)),
    'f' to arrayOf(arrayOf(20,11,14),arrayOf(02,22)),
    'g' to arrayOf(arrayOf(22,13,02,11,22,23,14,04)),
    'h' to arrayOf(arrayOf(00,04),arrayOf(03,12,23,24)),
    'i' to arrayOf(arrayOf(11),arrayOf(12,14)),
    'j' to arrayOf(arrayOf(11),arrayOf(13,14,04)),
    'k' to arrayOf(arrayOf(00,04),arrayOf(12,03,14)),
    'l' to arrayOf(arrayOf(11,14,24)),
    'm' to arrayOf(arrayOf(02,04),arrayOf(03,12,14),arrayOf(13,22,24)),
    'n' to arrayOf(arrayOf(02,04),arrayOf(03,12,22,24)),
    'o' to arrayOf(arrayOf(12,03,14,23,12)),
    'p' to arrayOf(arrayOf(01,04),arrayOf(02,11,22,13,03)),
    'q' to arrayOf(arrayOf(21,24),arrayOf(22,02,13,23)),
    'r' to arrayOf(arrayOf(02,04),arrayOf(03,12,22)),
    's' to arrayOf(arrayOf(22,12,03,23,14,04)),
    't' to arrayOf(arrayOf(02,22),arrayOf(11,14,24)),
    'u' to arrayOf(arrayOf(02,03,04,14,23),arrayOf(22,24)),
    'v' to arrayOf(arrayOf(02,14,22)),
    'w' to arrayOf(arrayOf(02,04,13,24,22)),
    'x' to arrayOf(arrayOf(02,24),arrayOf(22,04)),
    'y' to arrayOf(arrayOf(01,13),arrayOf(21,13,04)),
    'z' to arrayOf(arrayOf(02,22,04,24)),
    '{' to arrayOf(arrayOf(20,10,11,02,13,14,24)),
    '|' to arrayOf(arrayOf(10,14)),
    '}' to arrayOf(arrayOf(00,10,11,22,13,14,04)),
    '~' to arrayOf(arrayOf(02,11,12,22)),
)