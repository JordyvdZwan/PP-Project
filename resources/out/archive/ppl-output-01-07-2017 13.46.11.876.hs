import Sprockell 
prog :: [Instruction] 
prog = [Load (ImmValue (16)) 0, 
Push 1, Load (ImmValue (0)) 2, Compute Add 1 2 1, Store 0 (IndAddr 1), Pop 1, 
Load (ImmValue (0)) 2, 
Push 1, Load (ImmValue (4)) 3, Compute Add 1 3 1, Store 2 (IndAddr 1), Pop 1, 
Load (ImmValue (2)) 3, 
Push 1, Load (ImmValue (4)) 4, Compute Add 1 4 1, Store 3 (IndAddr 1), Pop 1, 
Push 1, Load (ImmValue (4)) 4, Compute Add 1 4 1, Load (IndAddr 1) 4, Pop 1, 
Load (ImmValue (5)) 5, 
Compute Lt 4 5 0, 
Branch 0(Abs 44), 
Push 1, Push 0, Load (ImmValue (4)) 0, Compute Add 1 0 1, Pop 0, Load (IndAddr 1) 2, Pop 1, 
Load (ImmValue (1)) 3, 
Compute Add 2 3 4, 
Push 1, Push 2, Load (ImmValue (4)) 2, Compute Add 1 2 1, Pop 2, Store 4 (IndAddr 1), Pop 1, 
Jump (Abs 19), 
Nop, 
Push 1, Push 3, Load (ImmValue (4)) 3, Compute Add 1 3 1, Pop 3, Load (IndAddr 1) 5, Pop 1, 
Load (ImmValue (5)) 0, 
Compute Equal 5 0 2, 
Branch 2(Abs 80), 
Load (ImmValue (0)) 3, 
Push 1, Push 4, Load (ImmValue (8)) 4, Compute Add 1 4 1, Pop 4, Store 3 (IndAddr 1), Pop 1, 
Load (ImmValue (-1)) 4, 
Push 1, Push 5, Load (ImmValue (8)) 5, Compute Add 1 5 1, Pop 5, Store 4 (IndAddr 1), Pop 1, 
Load (ImmValue (6)) 5, 
Push 1, Push 0, Load (ImmValue (4)) 0, Compute Add 1 0 1, Pop 0, Store 5 (IndAddr 1), Pop 1, 
Jump (Abs 88), 
Load (ImmValue (5)) 0, 
Push 1, Push 2, Load (ImmValue (4)) 2, Compute Add 1 2 1, Pop 2, Store 0 (IndAddr 1), Pop 1, 
Nop, 
Load (ImmValue (0)) 2, 
Push 1, Push 3, Load (ImmValue (12)) 3, Compute Add 1 3 1, Pop 3, Store 2 (IndAddr 1), Pop 1, 
EndProg ]
main = runWithDebugger (debuggerSimplePrint showLocalMem) [prog]

showLocalMem :: DbgInput -> String
showLocalMem ( _ , systemState ) = show $ localMem $ head $ sprStates systemState