import Sprockell 
prog :: [Instruction] 
prog = [Branch regSprID (Rel 2), Jump (Rel 6), ReadInstr (IndAddr regSprID), Receive regA, Compute Equal regA reg0 regB, Branch regB (Rel (-3)), Jump (Ind regA), Load (ImmValue (5)) 2, 
Push 3, Load (ImmValue (0)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
Load (ImmValue (100)) 4, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, WriteInstr 4 (IndAddr 3), Pop 3, 
Load (ImmValue 24) 7, WriteInstr 7 (DirAddr 1), Jump (Abs 62) , 
Nop, 
Load (ImmValue (0)) 2, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
TestAndSet (DirAddr 4), Receive 7, Branch 7 (Rel 2), Jump (Rel (-3)), 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, ReadInstr (IndAddr 3), Receive 4, Pop 3, 
Load (ImmValue (50)) 2, 
Compute Add 4 2 4, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, Store 4 (IndAddr 3), Pop 3, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, Load (IndAddr 3) 2, Pop 3, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, WriteInstr 2 (IndAddr 3), Pop 3, 
Load (ImmValue 0) 7, WriteInstr 7 (DirAddr 4), 
Load (ImmValue 1) 7, WriteInstr 7 (DirAddr 1), EndProg, 
Nop, 
Load (ImmValue (0)) 4, 
Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, Store 4 (IndAddr 3), Pop 3, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, ReadInstr (IndAddr 3), Receive 2, Pop 3, 
Load (ImmValue (20)) 4, 
Compute Add 2 4 2, 
Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, Load (IndAddr 3) 4, Pop 3, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, WriteInstr 4 (IndAddr 3), Pop 3, 
Push 3, ReadInstr (DirAddr 1), Receive 3, Load (ImmValue 1) 7, Compute Equal 7 3 7, Branch 7 (Rel (2)), Jump (Rel (-5)), Pop 3, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, ReadInstr (IndAddr 3), Receive 2, Pop 3, 
Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
EndProg]
main = runWithDebugger (debuggerSimplePrint showLocalMem) [prog]

showLocalMem :: DbgInput -> String
showLocalMem ( _ , systemState ) = show $ localMem $ head $ sprStates systemState