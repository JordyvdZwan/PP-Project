package checker;

import grammar.MainGrammarParser;
import grammar.NumberGrammarBaseVisitor;
import grammar.NumberGrammarParser;

/**
 * Created by Jordy van der Zwan on 14-Jun-17.
 * <p>
 * The NumberTestVisitor was build as a proof of concept of an written number to int conversion.
 * Though it returns a Long it is safe to cast the value to an integer as it makes sure no overflow can occur.
 * If an overflow is detected the visitWrittenNumber will return -1 which is an errorcode
 * <p>
 * NOTE: Only correct use is by accessing the value of visitNumber and adding the following code around it.
 * <p>
 * Luckily it was successful and has the following features:
 * - Using the grammar defined in maingrammar this class generates an Long given an correct written number *
 */
public class NumberTestVisitor extends NumberGrammarBaseVisitor<Long> {

    @Override
    public Long visitNumber(NumberGrammarParser.NumberContext ctx) {
        if (ctx.NumericNumber() != null) {
            return Long.parseLong(ctx.NumericNumber().getText());
        } else {
            return visit(ctx.writtenNumber());
        }
    }

    @Override
    public Long visitWrittenNumber(NumberGrammarParser.WrittenNumberContext ctx) {
        Long result = 0L;
        if (ctx.Zero() != null) {
            return 0L;
        }
        if (ctx.billion() != null) {
            result += visit(ctx.billion());
        }
        if (ctx.million() != null) {
            result += visit(ctx.million());
        }
        if (ctx.thousand() != null) {
            result += visit(ctx.thousand());
        }
        if (ctx.single() != null) {
            result += visit(ctx.single());
        }
        if (result > Integer.MAX_VALUE) {
            result = -1L;
        }
        return result;
    }

    @Override
    public Long visitSingle(NumberGrammarParser.SingleContext ctx) {
        if (ctx.hundred() != null) {
            if (ctx.hprefix() != null) {
                if (ctx.only() != null) {
                    return (visit(ctx.hprefix()) * 100) + visit(ctx.only());
                } else {
                    return (visit(ctx.hprefix()) * 100);
                }
            } else {
                if (ctx.only() != null) {
                    return 100 + visit(ctx.only());
                } else {
                    return 100L;
                }
            }
        } else {
            return visit(ctx.only());
        }
    }

    @Override
    public Long visitOnly(NumberGrammarParser.OnlyContext ctx) {
        if (ctx.singles() != null) {
            return visit(ctx.singles());
        } else if (ctx.main2() != null) {
            return visit(ctx.main2());
        } else {
            return visit(ctx.main1());
        }
    }

    @SuppressWarnings("Duplicates")
    @Override
    public Long visitSingles(NumberGrammarParser.SinglesContext ctx) {
        if (ctx.One() != null) {
            return 1L;
        } else if(ctx.Two() != null) {
            return 2L;
        } else if (ctx.Three() != null) {
            return 3L;
        } else if (ctx.Four() != null) {
            return 4L;
        } else if (ctx.Five() != null) {
            return 5L;
        } else if (ctx.Six() != null) {
            return 6L;
        } else if (ctx.Seven() != null) {
            return 7L;
        } else if (ctx.Eight() != null) {
            return 8L;
        } else if (ctx.Nine() != null) {
            return 9L;
        } else {
            return 10L;
        }
    }

    @Override
    public Long visitMain1(NumberGrammarParser.Main1Context ctx) {
        if (ctx.Eleven() != null) {
            return 11L;
        } else if (ctx.Twelve() != null) {
            return 12L;
        } else if (ctx.Eighteen() != null) {
            return 18L;
        } else {
            return 10 + visit(ctx.first());
        }
    }

    @Override
    public Long visitMain2(NumberGrammarParser.Main2Context ctx) {
        Long result = 0L;
        result += visit(ctx.doubles());
        if (ctx.seconds() != null) {
            result += visit(ctx.seconds());
        }
        return result;
    }

    @SuppressWarnings("Duplicates")
    @Override
    public Long visitHprefix(NumberGrammarParser.HprefixContext ctx) {
        return visit(ctx.only());
    }

    @SuppressWarnings("Duplicates")
    @Override
    public Long visitSeconds(NumberGrammarParser.SecondsContext ctx) {
        if (ctx.One() != null) {
            return 1L;
        } else if (ctx.Two() != null) {
            return 2L;
        } else if (ctx.Three() != null) {
            return 3L;
        } else if (ctx.Four() != null) {
            return 4L;
        } else if (ctx.Five() != null) {
            return 5L;
        } else if (ctx.Six() != null) {
            return 6L;
        } else if (ctx.Seven() != null) {
            return 7L;
        } else if (ctx.Eight() != null) {
            return 8L;
        } else {
            return 9L;
        }
    }

    @Override
    public Long visitFirst(NumberGrammarParser.FirstContext ctx) {
        if (ctx.Thir() != null) {
            return 3L;
        } else if (ctx.Four() != null) {
            return 4L;
        } else if (ctx.Fif() != null) {
            return 5L;
        } else if (ctx.Six() != null) {
            return 6L;
        } else if (ctx.Seven() != null) {
            return 7L;
        } else {
            return 9L;
        }
    }

    @Override
    public Long visitDoubles(NumberGrammarParser.DoublesContext ctx) {
        if (ctx.Twenty() != null) {
            return 20L;
        } else if (ctx.Thirty() != null) {
            return 30L;
        } else if (ctx.Forty() != null) {
            return 40L;
        } else if (ctx.Fifty() != null) {
            return 50L;
        } else if (ctx.Sixty() != null) {
            return 60L;
        } else if (ctx.Seventy() != null) {
            return 70L;
        } else if (ctx.Eighty() != null) {
            return 80L;
        } else {
            return 90L;
        }
    }

    @Override
    public Long visitThousand(NumberGrammarParser.ThousandContext ctx) {
        if (ctx.single() != null) {
            return visit(ctx.single()) * 1000;
        } else {
            return 1000L;
        }
    }

    @Override
    public Long visitMillion(NumberGrammarParser.MillionContext ctx) {
        if (ctx.single() != null) {
            return visit(ctx.single()) * 1000000;
        } else {
            return 1000000L;
        }
    }

    @Override
    public Long visitBillion(NumberGrammarParser.BillionContext ctx) {
        if (ctx.single() != null) {
            return visit(ctx.single()) * 1000000000;
        } else {
            return 1000000000L;
        }
    }
}
