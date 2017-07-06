import Sprockell 
prog :: [Instruction] 
prog = [Branch regSprID (Rel 2), Jump (Rel 6), ReadInstr (IndAddr regSprID), Receive regA, Compute Equal regA reg0 regB, Branch regB (Rel (-3)), WriteInstr regA numberIO, Jump (Ind regA), Load (ImmValue (6)) 2, 
Push 3, Load (ImmValue (0)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
Load (ImmValue (1)) 4, 
Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, Store 4 (IndAddr 3), Pop 3, 
Load (ImmValue (0)) 2, 
Push 3, Load (ImmValue (5)) 7, Compute Add 3 7 3, WriteInstr 2 (IndAddr 3), Pop 3, 
Load (ImmValue 30) 7, WriteInstr 7 (DirAddr 0), Jump (Abs 39) , 
Nop, 
Load (ImmValue (2)) 4, 
Push 3, Load (ImmValue (5)) 7, Compute Add 3 7 3, Store 4 (IndAddr 3), Pop 3, 
Load (ImmValue 1) 7, WriteInstr 7 (DirAddr 0), 
Nop, 
Push 3, ReadInstr (DirAddr 0), Receive 3, Load (ImmValue 2) 7, Compute Lt 7 3 7, Branch 7 (Rel (2)), Jump (Rel (-3)), 
Load (ImmValue (0)) 2, 
Push 3, Load (ImmValue (5)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
Load (ImmValue 54) 7, EndProg]
main = runWithDebugger (debuggerSimplePrint showLocalMem) [prog]

showLocalMem :: DbgInput -> String
showLocalMem ( _ , systemState ) = show $ localMem $ head $ sprStates systemState