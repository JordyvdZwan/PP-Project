import Sprockell 
prog :: [Instruction] 
prog = [Branch regSprID (Rel 2), Jump (Rel 6), ReadInstr (IndAddr regSprID), Receive regA, Compute Equal regA reg0 regB, Branch regB (Rel (-3)), Jump (Ind regA), Load (ImmValue (2)) 2, 
Push 3, Load (ImmValue (0)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
Load (ImmValue (5)) 4, 
Load (ImmValue (6)) 2, 
Compute Mul 4 2 4, 
Load (ImmValue (4)) 2, 
Load (ImmValue (2)) 5, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, Store 5 (IndAddr 3), Pop 3, 
Push 3, Load (ImmValue (2)) 7, Compute Add 3 7 3, Load (IndAddr 3) 5, Pop 3, 
Compute Sub 2 5 2, 
Load (ImmValue (3)) 5, 
Push 3, Load (ImmValue (3)) 7, Compute Add 3 7 3, Store 5 (IndAddr 3), Pop 3, 
Load (ImmValue (1)) 5, 
Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, Store 5 (IndAddr 3), Pop 3, 
Push 3, Load (ImmValue (3)) 7, Compute Add 3 7 3, Load (IndAddr 3) 5, Pop 3, 
Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, Load (IndAddr 3) 6, Pop 3, 
Compute Mul 5 6 5, 
Push 3, Load (ImmValue (5)) 7, Compute Add 3 7 3, Store 5 (IndAddr 3), Pop 3, 
Load (ImmValue (3)) 5, 
Push 3, Load (ImmValue (6)) 7, Compute Add 3 7 3, Store 5 (IndAddr 3), Pop 3, 
Push 3, Load (ImmValue (5)) 7, Compute Add 3 7 3, Load (IndAddr 3) 5, Pop 3, 
Push 3, Load (ImmValue (6)) 7, Compute Add 3 7 3, Load (IndAddr 3) 6, Pop 3, 
Compute Add 5 6 5, 
Push 3, Load (ImmValue (7)) 7, Compute Add 3 7 3, Store 5 (IndAddr 3), Pop 3, 
Push 3, Load (ImmValue (7)) 7, Compute Add 3 7 3, Load (IndAddr 3) 5, Pop 3, 
Compute Add 2 5 2, 
Load (ImmValue (1)) 5, 
Push 3, Load (ImmValue (8)) 7, Compute Add 3 7 3, Store 5 (IndAddr 3), Pop 3, 
Push 3, Load (ImmValue (8)) 7, Compute Add 3 7 3, Load (IndAddr 3) 5, Pop 3, 
Compute Sub 2 5 2, 
Compute Add 4 2 4, 
Push 3, Load (ImmValue (1)) 7, Compute Add 3 7 3, Store 4 (IndAddr 3), Pop 3, 
EndProg]
main = runWithDebugger (debuggerSimplePrint showLocalMem) [prog]

showLocalMem :: DbgInput -> String
showLocalMem ( _ , systemState ) = show $ localMem $ head $ sprStates systemState