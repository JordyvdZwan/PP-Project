import Sprockell 
prog :: [Instruction] 
prog = [Branch regSprID (Rel 2), Jump (Rel 6), ReadInstr (IndAddr regSprID), Receive regA, Compute Equal regA reg0 regB, Branch regB (Rel (-3)), Jump (Ind regA), Load (ImmValue (5)) 2, 
Push 3, Load (ImmValue (0)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
Load (ImmValue (0)) 4, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, WriteInstr 4 (IndAddr 3), Pop 3, 
Load (ImmValue (0)) 2, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
Load (ImmValue 30) 7, WriteInstr 7 (DirAddr 1), Jump (Abs 74) , 
Nop, 
Load (ImmValue (0)) 4, 
Push 3, Load (ImmValue (3)) 7, Compute Add 3 7 3, Store 4 (IndAddr 3), Pop 3, 
Push 3, Load (ImmValue (3)) 7, Compute Add 3 7 3, Load (IndAddr 3) 2, Pop 3, 
Load (ImmValue (50)) 4, 
Compute Lt 2 4 2, 
Branch 2(Abs 44), Jump (Abs 63), 
Push 3, Load (ImmValue (3)) 7, Compute Add 3 7 3, Load (IndAddr 3) 4, Pop 3, 
Load (ImmValue (1)) 2, 
Compute Add 4 2 4, 
Push 3, Load (ImmValue (3)) 7, Compute Add 3 7 3, Store 4 (IndAddr 3), Pop 3, 
Load (ImmValue (3)) 2, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, WriteInstr 2 (IndAddr 3), Pop 3, 
Jump (Abs 35), 
Nop, 
Load (ImmValue (5)) 4, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, WriteInstr 4 (IndAddr 3), Pop 3, 
Load (ImmValue 1) 7, WriteInstr 7 (DirAddr 1), EndProg, 
Nop, 
Load (ImmValue (0)) 2, 
Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, Load (IndAddr 3) 4, Pop 3, 
Load (ImmValue (50)) 2, 
Compute Lt 4 2 4, 
Branch 4(Abs 89), Jump (Abs 125), 
Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, Load (IndAddr 3) 2, Pop 3, 
Load (ImmValue (1)) 4, 
Compute Add 2 4 2, 
Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
Load (ImmValue (2)) 4, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, WriteInstr 4 (IndAddr 3), Pop 3, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, ReadInstr (IndAddr 3), Receive 2, Pop 3, 
Load (ImmValue (2)) 4, 
Compute NEq 2 4 2, 
Branch 2(Abs 117), Jump (Abs 123), 
Load (ImmValue (1)) 4, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, Store 4 (IndAddr 3), Pop 3, 
Nop, 
Jump (Abs 80), 
Nop, 
Load (ImmValue (5)) 2, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, WriteInstr 2 (IndAddr 3), Pop 3, 
EndProg]
main = runWithDebugger (debuggerSimplePrint myShow) [prog]

showLocalMem :: DbgInput -> String
showLocalMem ( _ , systemState ) = show $ localMem $ head $ sprStates systemState