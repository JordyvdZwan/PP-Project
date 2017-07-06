import Sprockell 
prog :: [Instruction] 
prog = [Branch regSprID (Rel 2), Jump (Rel 6), ReadInstr (IndAddr regSprID), Receive regA, Compute Equal regA reg0 regB, Branch regB (Rel (-3)), Jump (Ind regA), Load (ImmValue (2)) 2, 
Push 3, Load (ImmValue (0)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
Load (ImmValue (0)) 4, 
Push 3, Load (ImmValue (1)) 7, Compute Add 3 7 3, Store 4 (IndAddr 3), Pop 3, 
Load (ImmValue (4)) 2, 
Push 3, Load (ImmValue (1)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
Push 3, Load (ImmValue (1)) 7, Compute Add 3 7 3, Load (IndAddr 3) 4, Pop 3, 
Load (ImmValue (5)) 2, 
Compute Lt 4 2 4, 
Branch 4(Abs 37), Jump (Abs 49), 
Push 3, Load (ImmValue (1)) 7, Compute Add 3 7 3, Load (IndAddr 3) 2, Pop 3, 
Load (ImmValue (1)) 4, 
Compute Add 2 4 2, 
Push 3, Load (ImmValue (1)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
Jump (Abs 27), 
Nop, 
Push 3, Load (ImmValue (1)) 7, Compute Add 3 7 3, Load (IndAddr 3) 4, Pop 3, 
Load (ImmValue (5)) 2, 
Compute Equal 4 2 4, 
Branch 4(Abs 60), Jump (Abs 66), 
Load (ImmValue (6)) 2, 
Push 3, Load (ImmValue (1)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, 
Jump (Abs 72), 
Load (ImmValue (5)) 4, 
Push 3, Load (ImmValue (1)) 7, Compute Add 3 7 3, Store 4 (IndAddr 3), Pop 3, 
Nop, 
Load (ImmValue 71) 7, EndProg]
main = runWithDebugger (debuggerSimplePrint showLocalMem) [prog]

showLocalMem :: DbgInput -> String
showLocalMem ( _ , systemState ) = show $ localMem $ head $ sprStates systemState