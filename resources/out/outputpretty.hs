import Sprockell 
prog :: [Instruction] 
prog = [Branch regSprID (Rel 2), Jump (Rel 6), ReadInstr (IndAddr regSprID), Receive regA, Compute Equal regA reg0 regB, Branch regB (Rel (-3)), Jump (Ind regA), Load (ImmValue (3)) 2, 
Push 3, Load (ImmValue (0)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
Load (ImmValue (1)) 4, 
Push 3, Load (ImmValue (1)) 7, Compute Add 3 7 3, Store 4 (IndAddr 3), Pop 3, 
Load (ImmValue (0)) 2, 
Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, WriteInstr 2 (IndAddr 3), Pop 3, 
Load (ImmValue 29) 7, WriteInstr 7 (DirAddr 1), Jump (Abs 39) , 
Nop, 
Load (ImmValue (2)) 4, 
Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, WriteInstr 4 (IndAddr 3), Pop 3, 
Load (ImmValue 1) 7, WriteInstr 7 (DirAddr 1), EndProg, 
Nop, 
Push 3, ReadInstr (DirAddr 1), Receive 3, Load (ImmValue 1) 7, Compute Equal 7 3 7, Branch 7 (Rel (2)), Jump (Rel (-5)), Pop 3, 
Load (ImmValue (1)) 2, 
Push 3, Load (ImmValue (1)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
Load (ImmValue (2)) 4, 
Push 3, Load (ImmValue (1)) 7, Compute Add 3 7 3, Store 4 (IndAddr 3), Pop 3, 
Load (ImmValue (3)) 2, 
Push 3, Load (ImmValue (1)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
Load (ImmValue (4)) 4, 
Push 3, Load (ImmValue (1)) 7, Compute Add 3 7 3, Store 4 (IndAddr 3), Pop 3, 
Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, ReadInstr (IndAddr 3), Receive 2, Pop 3, 
Push 3, Load (ImmValue (1)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
EndProg]
main = runWithDebugger (debuggerSimplePrint myShow) [prog, prog]

showLocalMem :: DbgInput -> String
showLocalMem ( _ , systemState ) = show $ localMem $ head $ sprStates systemState