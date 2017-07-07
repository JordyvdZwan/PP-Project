package ilocGenerator.helperParsers;

import grammar.MainGrammarBaseVisitor;
import grammar.MainGrammarParser;

/**
 * Created by Jordy van der Zwan on 14-Jun-17.
 * <p>
 * The WrittenNumberParser was build as a proof of concept of an written number to int conversion.
 * Though it returns a Long it is safe to cast the value to an integer as it makes sure no overflow can occur.
 * If an overflow is detected the visitWrittenNumber will return -1 which is an errorcode
 * <p>
 * NOTE: Only correct use is by accessing the value of visitNumber and adding the following code around it.
 * <p>
 * Luckily it was successful and has the following features:
 * - Using the grammar defined in maingrammar this class generates an Long given an correct written number *
 */
public class WrittenNumberParser extends MainGrammarBaseVisitor<Long> {

    public static int getNumber(MainGrammarParser.NgWrittenNumberContext ctx) {
        WrittenNumberParser parser = new WrittenNumberParser();
        return (parser.visitNgWrittenNumber(ctx)).intValue();
    }

    /**
     * Checks which child to visit.
     * Returns his result of -1 if it is too big.
     * @param ctx The context of NgWrittenNumber.
     * @return The Integer
     */
    @Override
    public Long visitNgWrittenNumber(MainGrammarParser.NgWrittenNumberContext ctx) {
        Long result = 0L;
        if (ctx.NGZero() != null) {
            return 0L;
        }
        if (ctx.ngbillion() != null) {
            result += visit(ctx.ngbillion());
        }
        if (ctx.ngmillion() != null) {
            result += visit(ctx.ngmillion());
        }
        if (ctx.ngthousand() != null) {
            result += visit(ctx.ngthousand());
        }
        if (ctx.ngsingle() != null) {
            result += visit(ctx.ngsingle());
        }
        if (result > Integer.MAX_VALUE) {
            result = -1L;
        }
        return result;
    }

    /**
     * Visits the right child nodes.
     * Adds or multiplies 100 to the result.
     * @param ctx The context of Ngsingle.
     * @return The integer.
     */
    @Override
    public Long visitNgsingle(MainGrammarParser.NgsingleContext ctx) {
        if (ctx.nghundred() != null) {
            if (ctx.nghprefix() != null) {
                if (ctx.ngonly() != null) {
                    return (visit(ctx.nghprefix()) * 100) + visit(ctx.ngonly());
                } else {
                    return (visit(ctx.nghprefix()) * 100);
                }
            } else {
                if (ctx.ngonly() != null) {
                    return 100 + visit(ctx.ngonly());
                } else {
                    return 100L;
                }
            }
        } else {
            return visit(ctx.ngonly());
        }
    }

    /**
     * Chekcs which child to call and return that value.
     * @param ctx The context of Ngonly.
     * @return The Integer.
     */
    @Override
    public Long visitNgonly(MainGrammarParser.NgonlyContext ctx) {
        if (ctx.ngsingles() != null) {
            return visit(ctx.ngsingles());
        } else if (ctx.ngmain2() != null) {
            return visit(ctx.ngmain2());
        } else {
            return visit(ctx.ngmain1());
        }
    }

    /**
     * Checks the first digit.
     * @param ctx The context of Ngsingles.
     * @return the first digit.
     */
    @SuppressWarnings("Duplicates")
    @Override
    public Long visitNgsingles(MainGrammarParser.NgsinglesContext ctx) {
        if (ctx.NGOne() != null) {
            return 1L;
        } else if(ctx.NGTwo() != null) {
            return 2L;
        } else if (ctx.NGThree() != null) {
            return 3L;
        } else if (ctx.NGFour() != null) {
            return 4L;
        } else if (ctx.NGFive() != null) {
            return 5L;
        } else if (ctx.NGSix() != null) {
            return 6L;
        } else if (ctx.NGSeven() != null) {
            return 7L;
        } else if (ctx.NGEight() != null) {
            return 8L;
        } else if (ctx.NGNine() != null) {
            return 9L;
        } else {
            return 10L;
        }
    }

    /**
     * Checks whether to return 11, 12, 18 or 10 + the first digit.
     * @param ctx The context of Ngmain1.
     * @return The Integer.
     */
    @Override
    public Long visitNgmain1(MainGrammarParser.Ngmain1Context ctx) {
        if (ctx.NGEleven() != null) {
            return 11L;
        } else if (ctx.NGTwelve() != null) {
            return 12L;
        } else if (ctx.NGEighteen() != null) {
            return 18L;
        } else {
            return 10 + visit(ctx.ngfirst());
        }
    }

    /**
     * adds the correct first and second digit.
     * @param ctx The context of Nhmain2.
     * @return the integer.
     */
    @Override
    public Long visitNgmain2(MainGrammarParser.Ngmain2Context ctx) {
        Long result = 0L;
        result += visit(ctx.ngdoubles());
        if (ctx.ngseconds() != null) {
            result += visit(ctx.ngseconds());
        }
        return result;
    }

    /**
     * Checks the prefix.
     * @param ctx The context of Nghprefix
     * @return the Integer
     */
    @SuppressWarnings("Duplicates")
    @Override
    public Long visitNghprefix(MainGrammarParser.NghprefixContext ctx) {
        return visit(ctx.ngonly());
    }

    /**
     * Returns the first digit.
     * @param ctx The context of Ngseconds
     * @return The first digit.
     */
    @SuppressWarnings("Duplicates")
    @Override
    public Long visitNgseconds(MainGrammarParser.NgsecondsContext ctx) {
        if (ctx.NGOne() != null) {
            return 1L;
        } else if (ctx.NGTwo() != null) {
            return 2L;
        } else if (ctx.NGThree() != null) {
            return 3L;
        } else if (ctx.NGFour() != null) {
            return 4L;
        } else if (ctx.NGFive() != null) {
            return 5L;
        } else if (ctx.NGSix() != null) {
            return 6L;
        } else if (ctx.NGSeven() != null) {
            return 7L;
        } else if (ctx.NGEight() != null) {
            return 8L;
        } else {
            return 9L;
        }
    }

    /**
     * Returns the first digit.
     * @param ctx The context of Ngfirst
     * @return The first digit.
     */
    @Override
    public Long visitNgfirst(MainGrammarParser.NgfirstContext ctx) {
        if (ctx.NGThir() != null) {
            return 3L;
        } else if (ctx.NGFour() != null) {
            return 4L;
        } else if (ctx.NGFif() != null) {
            return 5L;
        } else if (ctx.NGSix() != null) {
            return 6L;
        } else if (ctx.NGSeven() != null) {
            return 7L;
        } else {
            return 9L;
        }
    }

    /**
     * Returns the correct decimal value.
     * @param ctx The context of Ngdoubles.
     * @return The second digit
     */
    @Override
    public Long visitNgdoubles(MainGrammarParser.NgdoublesContext ctx) {
        if (ctx.NGTwenty() != null) {
            return 20L;
        } else if (ctx.NGThirty() != null) {
            return 30L;
        } else if (ctx.NGForty() != null) {
            return 40L;
        } else if (ctx.NGFifty() != null) {
            return 50L;
        } else if (ctx.NGSixty() != null) {
            return 60L;
        } else if (ctx.NGSeventy() != null) {
            return 70L;
        } else if (ctx.NGEighty() != null) {
            return 80L;
        } else {
            return 90L;
        }
    }

    /**
     * Chekcs the first number and multiplies it with a thousand.
     * @param ctx The context of Ngthousand.
     * @return The integer
     */
    @Override
    public Long visitNgthousand(MainGrammarParser.NgthousandContext ctx) {
        if (ctx.ngsingle() != null) {
            return visit(ctx.ngsingle()) * 1000;
        } else {
            return 1000L;
        }
    }

    /**
     * Chekcs the first number and multiplies it with a million.
     * @param ctx The context of Ngmillion.
     * @return The integer
     */
    @Override
    public Long visitNgmillion(MainGrammarParser.NgmillionContext ctx) {
        if (ctx.ngsingle() != null) {
            return visit(ctx.ngsingle()) * 1000000;
        } else {
            return 1000000L;
        }
    }

    /**
     * Chekcs the first number and multiplies it with a billion.
     * @param ctx The context of Ngbillion.
     * @return The integer
     */
    @Override
    public Long visitNgbillion(MainGrammarParser.NgbillionContext ctx) {
        if (ctx.ngsingle() != null) {
            return visit(ctx.ngsingle()) * 1000000000;
        } else {
            return 1000000000L;
        }
    }
}
