import Sprockell 
prog :: [Instruction] 
prog = [Nop, Branch regSprID (Rel -1), Load (ImmValue (12)) 2, Push 3, Load (ImmValue (0)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, Load (ImmValue (1)) 4, Push 3, Load (ImmValue (4)) 7, Compute Add 3 7 3, Store 4 (IndAddr 3), Pop 3, Load (ImmValue (0)) 2, Push 3, Load (ImmValue (8)) 7, Compute Add 3 7 3, WriteInstr 2 (IndAddr 3), Pop 3, Load (ImmValue null) 7, WriteInstr 7 (DirAddr =>, Load (ImmValue (2)) 4, Push 3, Load (ImmValue (8)) 7, Compute Add 3 7 3, Store 4 (IndAddr 3), Pop 3, Load (ImmValue 1) 7, WriteInstr 7 (DirAddr =>), Nop, Push 3, ReadInstr 1, Receive 3, Load (ImmValue 2) 7, Compare Lt 7, Branch 7 (Rel (2), Jump (Rel (-3)), Load (ImmValue (0)) 2, Push 3, Load (ImmValue (8)) 7, Compute Add 3 7 3, Store 2 (IndAddr 3), Pop 3, EndProg ]
main = runWithDebugger (debuggerSimplePrint showLocalMem) [prog]

showLocalMem :: DbgInput -> String
showLocalMem ( _ , systemState ) = show $ localMem $ head $ sprStates systemState