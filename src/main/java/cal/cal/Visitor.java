package cal.cal;

public class Visitor extends CalBaseVisitor<Integer> {
    @Override
    public Integer visitAddsub(CalParser.AddsubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if(ctx.op.getType() == CalParser.ADD) {
            return left + right;
        }
        return left - right;
    }

    @Override
    public Integer visitMuldiv(CalParser.MuldivContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if(ctx.op.getType() == CalParser.MUL) {
            return left * right;
        }
        return left / right;
    }

    @Override
    public Integer visitInt(CalParser.IntContext ctx) {
        return Integer.valueOf(ctx.INTEGER().getText());
    }

    @Override
    public Integer visitParens(CalParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitPrint(CalParser.PrintContext ctx) {
        int v = visit(ctx.expr());
        System.out.println(v);
        return 0;
    }
}
