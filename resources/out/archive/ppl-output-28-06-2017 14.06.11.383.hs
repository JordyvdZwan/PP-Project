import Sprockell 
prog :: [Instruction] 
prog = [Load (ImmValue 8) 0, Push 1, Load (ImmValue 0) 2, Compute Add 1 2 1, Store 0 (IndAddr 1), Pop 1, Load (ImmValue 0) 2, Push 1, Load (ImmValue 4) 3, Compute Add 1 3 1, Store 2 (IndAddr 1), Pop 1, Push 1, Load (ImmValue 4) 3, Compute Add 1 3 1, Load (IndAddr 1) 3, Pop 1, Load (ImmValue 1) 4, Compute Add 3 4 5, Push 1, Push 0, Load (ImmValue 4) 0, Compute Add 1 0 1, Pop 0, Store 5 (IndAddr 1), Pop 1, EndProg ] 
main = run [prog]