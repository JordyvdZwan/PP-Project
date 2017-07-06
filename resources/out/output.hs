import Sprockell 
prog :: [Instruction] 
prog = [Nop, Branch regSprID (Rel -1), Load (ImmValue (8)) 2, Push 3, Load (ImmValue (0)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, Load (ImmValue (0)) 3, Load (ImmValue (0)) 4, Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, Store 4 (IndAddr 3), Pop 3, Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, Load (IndAddr 3) 2, Pop 3, Load (ImmValue (1)) 4, Compute Add 2 4 2, Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, EndProg ]
main = runWithDebugger (debuggerSimplePrint showLocalMem) [prog]

showLocalMem :: DbgInput -> String
showLocalMem ( _ , systemState ) = show $ localMem $ head $ sprStates systemState