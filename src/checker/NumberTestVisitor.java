package checker;

import grammar.MainGrammarBaseVisitor;
import grammar.MainGrammarParser;

/**
 * Created by Jordy van der Zwan on 14-Jun-17.
 */
public class NumberTestVisitor extends MainGrammarBaseVisitor<Long> {

    @Override
    public Long visitNumber(MainGrammarParser.NumberContext ctx) {
        if (ctx.NumericNumber() != null) {
            return Long.parseLong(ctx.NumericNumber().getText());
        } else {
            return visit(ctx.writtenNumber());
        }
    }

    @Override
    public Long visitWrittenNumber(MainGrammarParser.WrittenNumberContext ctx) {
        Long result = new Long(0);
        if (ctx.Zero() != null) {
            return new Long(0);
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
    public Long visitSingle(MainGrammarParser.SingleContext ctx) {
        if (ctx.hundred() != null) {
            if (ctx.only() != null) {
                if (ctx.only(1) != null) {
                    return (visit(ctx.only(0)) * 100) + visit(ctx.only(1));
                } else {
                    return 100 * visit(ctx.only(0));
                }
            } else {
                if (ctx.only(0) != null) {
                    return visit(ctx.only(0)) * 100;
                } else {
                    return 100L;
                }
            }
        } else {
            return visit(ctx.only(0));
        }
    }

    @Override
    public Long visitOnly(MainGrammarParser.OnlyContext ctx) {
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
    public Long visitSingles(MainGrammarParser.SinglesContext ctx) {
        if (ctx.Two() != null) {
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
    public Long visitMain1(MainGrammarParser.Main1Context ctx) {
        if (ctx.Eleven() != null) {
            return 11L;
        } else if (ctx.Twelve() != null) {
            return 12L;
        } else {
            return 10 + visit(ctx.first());
        }
    }

    @Override
    public Long visitMain2(MainGrammarParser.Main2Context ctx) {
        Long result = 0L;
        result += visit(ctx.doubles());
        if (ctx.seconds() != null) {
            result += visit(ctx.seconds());
        }
        return result;
    }

    @SuppressWarnings("Duplicates")
    @Override
    public Long visitHprefix(MainGrammarParser.HprefixContext ctx) {
        if (ctx.Two() != null) {
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

    @SuppressWarnings("Duplicates")
    @Override
    public Long visitSeconds(MainGrammarParser.SecondsContext ctx) {
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
    public Long visitFirst(MainGrammarParser.FirstContext ctx) {
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
        } else if (ctx.Eigh() != null) {
            return 8L;
        } else {
            return 9L;
        }
    }

    @Override
    public Long visitDoubles(MainGrammarParser.DoublesContext ctx) {
        if (ctx.Twenty() != null) {
            return new Long(20);
        } else if (ctx.Thirty() != null) {
            return new Long(30);
        } else if (ctx.Forty() != null) {
            return new Long(40);
        } else if (ctx.Fifty() != null) {
            return new Long(50);
        } else if (ctx.Sixty() != null) {
            return new Long(60);
        } else if (ctx.Seventy() != null) {
            return new Long(70);
        } else if (ctx.Eighty() != null) {
            return new Long(80);
        } else {
            return new Long(90);
        }
    }

    @Override
    public Long visitThousand(MainGrammarParser.ThousandContext ctx) {
        if (ctx.single() != null) {
            return visit(ctx.single()) * 1000;
        } else {
            return new Long(1000);
        }
    }

    @Override
    public Long visitMillion(MainGrammarParser.MillionContext ctx) {
        if (ctx.single() != null) {
            return visit(ctx.single()) * 1000000;
        } else {
            return new Long(1000000);
        }
    }

    @Override
    public Long visitBillion(MainGrammarParser.BillionContext ctx) {
        if (ctx.single() != null) {
            return visit(ctx.single()) * 1000000000;
        } else {
            return new Long(1000000000);
        }
    }
}
